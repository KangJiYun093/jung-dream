// /* modal */
// $('#deleteCont-button').on('click', function(){
//     console.log("들어옴");
//     $('#deleteCont-modal').css('display','flex');
// })

// $('.cancel-btn').on('click', function(){
//     console.log("취소 버튼");
//     $('#delete-modal').css('display','none');
// });
// /* modal */

/* 삭제 버튼 모달 */
$(document).ready(function() {
    $('.deleteCont-button').click(function(){
        console.log("삭제 버튼 클릭");
        $('#deleteCont-modal').show();
        console.log("모달 열기");
    })
})

// 닫기 버튼 클릭 이벤트 처리
$(".cancel-btn").click(function() {
    $("#deleteCont-modal").hide(); // 모달 창 숨김
  });

  // 모달 창 외부 클릭 시 이벤트 처리
//   $(window).click(function(e) {
//     if ($(e.target).is('.modal')) {
//       $("#deleteCont-modal").hide(); // 모달 창 숨김
//     }
//   });