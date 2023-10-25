let userid = document.querySelector(".userid");
        let userpw = document.querySelector(".userpw");
        let button = document.querySelector("button");

        // 페이지 로딩 후 실행되는 자바스크립트
        window.onload = () => {
            userid.focus();
        }

        // 내부함수 방법
        // button.onclick = function (e) {

        //     // alert("ok");

        //     e.preventDefault();

        //     if (!userid) {
        //         alert("아이디를 입력하세요.");
        //         return false;
        //     }
        // }

        // 화살표함수 방법
        // button.onclick = (e) => {

        //     e.preventDefault();

        // }

        // button.addEventListener(이벤트, 함수);

        // button.addEventListener('click', function(e) {

        //     e.preventDefault();

        //     if (!userid.value) {
        //         alert("아이디를 입력하세요.");
        //     }

        // });

        // addEventListener(이벤트, 화살표함수);
        button.addEventListener('click', (e) => {

            // input 버튼을 누르면 다음 페이지로 이동하는 특징이 있음
            // 이동 특징 제거 : e.preventDefault();
            e.preventDefault();

            if (!userid.value) {
                alert("아이디를 입력하세요.");
                userid.focus();
                return false;
            }

            if (!userpw.value) {
                alert("비밀번호를 입력하세요.");
                userpw.focus();
                return false;

            }

        });