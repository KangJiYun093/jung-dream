// 현재시간
var Target = document.querySelector(".time");

function clock() {
    var time = new Date();

    var month = time.getMonth();
    var date = time.getDate();
    var day = time.getDay();
    var week = ['일', '월', '화', '수', '목', '금', '토'];

    var hours = time.getHours();
    var minutes = time.getMinutes();
    var seconds = time.getSeconds();

    Target.innerText =
        ` ${month + 1}월 ${date}일 ${week[day]}요일 ` +
        `${hours < 10 ? `0${hours}` : hours}:${minutes < 10 ? `0${minutes}` : minutes}:${seconds < 10 ? `0${seconds}` : seconds}`;

}
clock();
setInterval(clock, 1000); // 1초마다 실행

/* modal */
$('#delete-button').on('click', function(){
    console.log("들어옴");
    $('#delete-modal').css('display','flex');
})

$('.cancel-btn').on('click', function(){
    console.log("취소 버튼");
    $('#write-modal').css('display','none');
    $('#delete-modal').css('display','none');
});

$('.confirm-btn').on('click', function(){
    console.log("확인 버튼");
    $('#write-modal').css('display','none');
    $('#delete-modal').css('display','none');
    $('#detail-modal').css('display','none');
});
/* modal */

/* date format*/
function formatDate(date) {
    var year = date.getFullYear();
    var month = String(date.getMonth() + 1).padStart(2, '0');
    var day = String(date.getDate()).padStart(2, '0');
    return year + '-' + month + '-' + day;
}


/* 삭제 버튼 모달 */
$(document).ready(function() {
    $('.delete-button').click(function(){
        console.log("삭제 버튼 클릭");
        $('#delete-modal').show();
        console.log("모달 열기");
    })
})

/* 글쓰기 버튼 모달 */
$(document).ready(function() {
    $('.write-button').click(function(){
        console.log("글쓰기 버튼 클릭");
        $('#write-modal').show();
        console.log("모달 열기");
    })
})

/* 상세 항목 모달 */
$(document).ready(function() {
    $('tr').click(function(){
        console.log("상세 항목 클릭");
        $('#detail-modal').show();
        console.log("모달 열기");
    })
})


$(document).ready(function() {
    $('li').click(function(){
        console.log("상세 항목 클릭");
        $('#detail-modal').show();
        console.log("모달 열기");
    })
})


/* 이미지 팝업 모달 */
$(document).ready(function() {
    $('.detail-images img').click(function(){
        console.log("이미지 클릭");
        $('.image-show-modal').show();
        console.log("모달 열기");
    })
})

$(".image-show-modal button").click(function(){
    $(".image-show-modal").hide();
});


// $(document).ready(function() {
//     $('.plus-btn').click(function(){
//         console.log("플러스 버튼 클릭");
//         $('.plus-btn').parent().parent().prev().append(`<br><div class="option-kind">
//         <div class="form-group">
//             <label>규격</label> 
//             <input class="form-control" name="option">
//         </div>
//         <div class="form-group">
//             <label>개수</label> 
//             <input class="form-control" name="count">
//         </div>
//         <div class="form-group">
//             <label>키로수</label> 
//             <input class="form-control" name="weigh">
//         </div>
//         <div class="form-group">
//             <label>가격</label> 
//             <input class="form-control" name="price">
//         </div>
//         <div class="plus-min-btn">
//             <img class="plus-btn" src="../../static/image/admin/plus.png">
//             <img class="minus-btn" src="../../static/image/admin/minus.png">
//           </div>
//         </div>`);
//         console.log("플러스 추가");
//     })
// })


$(document).ready(function() {
    var parentElement = $('.plus-btn').parent().parent().prev();
    console.log(parentElement);
});


$(document).ready(function() {
    $('.minus-btn').click(function(){
        console.log("마이너스 버튼 클릭");
        $('.minus-btn').remove('');
        console.log("플러스 추가");
    })
})

