let $id = $('.id');
let $pw = $('.pw');
let $pw_check = $('.pw_check');
let $email = $('.email');
let $name = $('.name');
let $nickname = $('.nickname');

let $msg01 = $('.error-msg-01');
let $msg02 = $('.error-msg-02');
let $msg03 = $('.error-msg-03');
let $msg04 = $('.error-msg-04');

$('#id_check').on('click', function(){
    $.ajax({
        type: 'GET',
        url: '/check/checkId',
        data: {
            id: $id.val()
        },
        success: idCheck,
        error: function(xhr, status, error) {
            console.log(this.data);
            // AJAX 요청 실패 시 처리
            console.log(xhr.responseText); // 서버로부터 받은 응답 내용 출력
            console.log(error); // 발생한 오류 출력
            alert('서버 오류가 발생했습니다.');
        }
    })
});

function idCheck(data){
    if(data) {
        console.log("success");
        $msg01.text("사용 가능한 아이디입니다.");
    } else {
        $msg01.text("이미 존재하는 아이디입니다.");
    }
}