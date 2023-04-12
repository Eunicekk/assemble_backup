let $btn01 = $('.01');
let $btn02 = $('.02');
let $btn03 = $('.03');
let $btn04 = $('.04');
let $selectUl01 = $('.option-list').eq(0);
let $selectUl02 = $('.option-list').eq(1);
let $selectUl03 = $('.option-list').eq(2);
let $selectUl04 = $('.option-list').eq(3);

// 버튼 누르면 셀렉트 박스 노출 / 비노출
$btn01.on('click', function(){
    $btn01.next().toggle();
})
$btn02.on('click', function(){
    $btn02.next().toggle();
})
$btn03.on('click', function(){
    $btn03.next().toggle();
})
$btn04.on('click', function(){
    $btn04.next().toggle();
})

// 셀렉트 박스 옵션 선택 시 버튼에 내용 바뀜
$selectUl01.children().on('click', function(){
    var text = $(this).html();
    $btn01.html(text);
    $btn01.next().toggle();
    $btn01.css('color', '#333333');

    // 진행 방식 '오프라인' 선택 시 모임 지역 노출
    if(text === "오프라인"){
        $('.select-area').css('visibility', 'visible');
        $("#online-check").prop("checked", false);
    }
    else {
        $('.select-area').css('visibility', 'hidden');
        $("#online-check").prop("checked", true);
    }
});
$selectUl02.children().on('click', function(){
    var text = $(this).html();
    $btn02.html(text);
    $btn02.next().toggle();
    $btn02.css('color', '#333333');
    $("#area").val(text);
    console.log(document.getElementById("area").innerText);
});
$selectUl03.children().on('click', function(){
    var text = $(this).html();
    $btn03.html(text);
    $btn03.next().toggle();
    $btn03.css('color', '#333333');
    $("#topic").val(text);
    console.log(document.getElementById("topic").innerText);
});
$selectUl04.children().on('click', function(){
    var text = $(this).html();
    $btn04.html(text);
    $btn04.next().toggle();
    $btn04.css('color', '#333333');
    text = text.slice(0, -1);
    text = Number(text);
    $("#number").val(text);
    console.log(document.getElementById("number").value);
});

// 셀렉트 박스 이외 선택 시 셀렉트 박스 비노출
$('body').on('click', function(e){
    if($selectUl01.css('display') == 'block'){
        if($('.select-wrap').eq(0).has(e.target).length == 0){
            $selectUl01.hide()
        }
    }
});
$('body').on('click', function(e){
    if($selectUl02.css('display') == 'block'){
        if($('.select-wrap').eq(1).has(e.target).length == 0){
            $selectUl02.hide()
        }
    }
});
$('body').on('click', function(e){
    if($selectUl03.css('display') == 'block'){
        if($('.select-wrap').eq(2).has(e.target).length == 0){
            $selectUl03.hide()
        }
    }
});
$('body').on('click', function(e){
    if($selectUl04.css('display') == 'block'){
        if($('.select-wrap').eq(3).has(e.target).length == 0){
            $selectUl04.hide()
        }
    }
});

