/* 이미지 팝업 모달 */
$(document).ready(function() {
    $('.plus-btn').click(function(){
        let text;

        text = 
        `
            <div class="option-kind">
                <div class="form-group">
                    <label>규격</label> 
                    <input class="form-control" name="option">
                </div>
                <div class="form-group">
                    <label>개수</label> 
                    <input class="form-control" name="count">
                </div>
                <div class="form-group">
                    <label>키로수</label> 
                    <input class="form-control" name="weigh">
                </div>
                <div class="form-group">
                    <label>가격</label> 
                    <input class="form-control" name="price">
                </div>
                <div class="plus-min-btn">
                    <img class="plus-btn" src="../../static/image/admin/plus.png">
                    <img class="minus-btn" src="../../static/image/admin/minus.png">
                </div>
            </div>
        `;

        $(this).parents('.option-class').after(text);

        $('.minus-btn').click(function(){
            console.log("adst 버튼 클릭");
            console.log($(this).parents('.option-class'));
            $(this).parents('.option-kind').remove();
            console.log("플러스 추가");
        })
    })


    // var parentElement = $('.minus-btn').parents('.option-class');
    // console.log(parentElement);
});
