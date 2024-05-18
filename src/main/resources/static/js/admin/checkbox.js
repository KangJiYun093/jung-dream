// 체크박스
 /* 전체 선택을 눌렀을 때 */
 $('#all-check').on('click', function() {
    if(!$(this).is(':checked')) {
        console.log("체크 되어있음")
        $('input:checkbox').prop('checked', false);
        $(this).prop('checked', false);
    } else {
        console.log("체크 안 되어있음")
        $('input:checkbox').prop('checked', true);
        $(this).prop('checked', true);
    }
});

/* 개별 선택할때 전체 선택 처리 */
$(document).on('click', 'input[name=check]', function() {
    var total = $("input[name=check]").length;
    var checked = $("input[name=check]:checked").length;

    if(total != checked) {
        $(".all-check").prop("checked", false);
    } else {
        $(".all-check").prop("checked", true);
    }
});

function selectCheckbox() {
    let arr = [];
    $('input[name=check]').each((i, data) => {
        if($(data).is(':checked')) {
            arr[i] = $(data).closest('.list').find('.id').val();
        }
    });
    console.log(arr)
}

$('.delete-button').on('click', () => {
    selectCheckbox();
});