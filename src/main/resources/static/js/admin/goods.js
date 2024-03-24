/* 이미지 팝업 모달 */
$(document).ready(function() {

    $('#product-kind').on('change', function() {
        $productRegistrationId = $(this).val();

        productRegistrations.forEach(productRegistration => {
            if(productRegistration.productRegistrationId != $productRegistrationId) {
                return;
            }

            let text = ``;
            if(productRegistration.productRegistrationSpecification == 'Y') {
                text += `
                    <div class="form-group">
                        <label>규격</label>
                        <input type="text" class="form-control" name="option">
                    </div>
                `;
            }
            if(productRegistration.productRegistrationWeight == 'Y') {
                text += `
                    <div class="form-group">
                        <label>키로수</label>
                        <input type="text" class="form-control" name="weight">
                    </div>
                `;
            }
            if(productRegistration.productRegistrationQuantity == 'Y') {
                text += `
                    <div class="form-group">
                        <label>개수</label>
                        <input type="text" class="form-control" name="count">
                    </div>
                `;
            }
            if(productRegistration.productRegistrationPrice == 'Y') {
                text += `
                    <div class="form-group">
                        <label>가격</label>
                        <input type="text" class="form-control" name="price">
                    </div>
                `;
            }
            text += `
            <div class="plus-min-btn">
                <img class="plus-btn" src="/image/admin/plus.png">
                <img class="minus-btn" src="/image/admin/minus.png">
            </div>
            `;

            $('#insert-option-kind').html(text);
        });
    });
    $('.plus-btn').click(function(){
        let text;

        text =
        `
            <div class="option-kind">
        `

        text += `
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
                    <img class="plus-btn" src="/image/admin/plus.png">
                    <img class="minus-btn" src="/image/admin/minus.png">
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
