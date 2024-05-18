$(function() {

    orders.forEach(order => {
        let text  = `
            <tr class="list">
                <input type="hidden" class="id" value="${order.orderId}">
                <td><input type="checkbox" name="check"></td>
                <td>${order.orderId}</td>
                <td>${order.orderCustomerName}</td>
                <td>${order.orderCustomerPhone}</td>
                <td>${order.orderRecipientName}</td>
                <td>${order.orderRecipientPhone}</td>
                <td>${order.productTitle}</td>
                <td>${order.orderStatus}</td>
                <td>${order.orderTotalPrice}</td>
                <td>${order.orderDate}</td>
            </tr>
        `;

        $('.order-list-content').append(text);
    });
});