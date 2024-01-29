$(function() {

    /* 처음 화면이 로드되었을때 상품 소계와 총 결제 금액 넣기 */
    let $productTotalPrice = $('.product-total-price');
    let $totalPrice = $('.real-total-price');

    let firstTotalPrice = 0;
    $('input[name=onePrice]').each((i, e) => {
        firstTotalPrice = firstTotalPrice + parseInt($(e).val());
    });
    $productTotalPrice.text(firstTotalPrice.toLocaleString('ko-KR'));
    $totalPrice.text($productTotalPrice.text());

    /* 전체 선택을 눌렀을 때 */
    $('.all-check').on('click', function() {
        if(!$(this).is(':checked')) {
            $('input:checkbox').prop('checked', false);
            $(this).prop('checked', false);
        } else {
            $('input:checkbox').prop('checked', true);
            $(this).prop('checked', true);
        }
    });

    /* 개별 선택할때 전체 선택 처리 */
    $("input[name=check]").click(function() {
		var total = $("input[name=check]").length;
		var checked = $("input[name=check]:checked").length;

		if(total != checked) {
            $(".all-check").prop("checked", false);
        } else {
            $(".all-check").prop("checked", true);
        }
	});


    /* 수량 선택에 + 눌렀을 때 */
    $('.plus').on('click', function() {
        let $number = $(this).parents('.content-loop').find('input[name=number]');
        let $price = $(this).parents('.content-loop').find('.price-text');
        let $productPrice = $(this).parents('.content-loop').find('input[name=onePrice]').val();
        
        /* 각 요소의 가격 넣기 */
        $number.val(parseInt($number.val()) + 1);
        $price.text(($productPrice * parseInt($number.val())).toLocaleString('ko-KR'));
        
        let calculatePrice = 0;
        $('.price-text').each((i, e) => {
            calculatePrice = calculatePrice + parseInt($(e).text().replace(',', ''));
        });

        /* 제일 밑 상품 소계, 총 결제금액 변경 */
        $productTotalPrice.text(calculatePrice.toLocaleString('ko-KR'));
        $totalPrice.text($productTotalPrice.text());
    });

    /* 수량 선택에 - 눌렀을 때 */
    $('.minus').on('click', function() {
        let $number = $(this).parents('.content-loop').find('input[name=number]');
        let $price = $(this).parents('.content-loop').find('.price-text');
        let $productPrice = $(this).parents('.content-loop').find('input[name=onePrice]').val();

        // 수량이 1보다 작거나 같으면 - 안되게
        if($number.val() <= 1) {
            return;
        }

        /* 각 요소의 가격 넣기 */
        $number.val(parseInt($number.val()) - 1);
        $price.text(($productPrice * parseInt($number.val())).toLocaleString('ko-KR'));

        let calculatePrice = 0;
        $('.price-text').each((i, e) => {
            calculatePrice = calculatePrice + parseInt($(e).text().replace(',', ''));
        });

        /* 제일 밑 상품 소계, 총 결제금액 변경 */
        $productTotalPrice.text(calculatePrice.toLocaleString('ko-KR'));
        $totalPrice.text($productTotalPrice.text());
    });

});