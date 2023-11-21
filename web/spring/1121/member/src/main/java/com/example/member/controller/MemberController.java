package com.example.member.controller;

import com.example.member.dto.MemberDto;
import com.example.member.mappers.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/member")
public class MemberController {

    @Autowired
    MemberMapper memberMapper;

    @GetMapping("")
    public String getMemberList(Model model, @RequestParam(defaultValue = "") String searchType, @RequestParam(defaultValue = "") String words) {

        System.out.println(searchType);
        System.out.println(words);

        String queryString = "";
        if(searchType.equals("userid")) {
            queryString = "where userid = '"+ words +"'";
        }else if (searchType.equals("username")) {
            queryString = "where username = '"+ words +"'";
        }else {
            queryString = "";
        }
        System.out.println(queryString);

        model.addAttribute("mem", memberMapper.getMemberList(queryString));
        model.addAttribute("cnt", memberMapper.getMemberCount(queryString));
        return "member/list.html";
    }

    @GetMapping("/insert")
    public String getInsert() {
        return "member/insert.html";
    }

//    입력값을 저장하는 주소
//    입력이 끝난 후 이동 -> redirect:/
    @PostMapping("/insert")
    public String setInsert(@ModelAttribute MemberDto memberDto, RedirectAttributes ra) {
//        System.out.println(memberDto.getId());
//        System.out.println(memberDto.getUserid());

        memberMapper.setInsert(memberDto);
        //post 타입 : 주소에 드러나지 않음(addFlashAttribute)
        //model.attribute -> get 방식 -> 주소에 드러남
        ra.addFlashAttribute("msg", "회원가입이 완료되었습니다.");

        return "redirect:/member";
    }

    @GetMapping("/delete")
    public String deleteMember(@RequestParam int id, RedirectAttributes ra) {
        System.out.println(id);
        memberMapper.deleteMember(id);
        ra.addFlashAttribute("msg", "삭제되었습니다.");
        return "redirect:/member";
    }
}
