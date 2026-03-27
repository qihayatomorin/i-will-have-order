package com.campus.service;

import com.campus.dto.*;
import com.campus.result.PageResult;
import com.campus.vo.OrderStatisticsVO;
import com.campus.vo.OrderSubmitVO;
import com.campus.vo.OrderVO;

public interface OrderService {
    OrderSubmitVO submit(OrdersSubmitDTO ordersSubmitDTO);

    /**
     * 订单支付
     * @param ordersPaymentDTO
     * @return
     */
    void payment(OrdersPaymentDTO ordersPaymentDTO);

    PageResult<OrderVO> getHistoryOrders(OrdersPageQueryDTO ordersPageQueryDTO);

    OrderVO getUserOrderDetail(Long id);

    void repeatOrder(Long id);

    void userCancelOrder(Long id);

    PageResult<OrderVO> getOrderListByCondition(OrdersPageQueryDTO ordersPageQueryDTO);

    OrderVO getOrderDetail(Long id);

    void confirmOrder(Long id);

    OrderStatisticsVO statistics();

    void rejectOrder(OrdersRejectionDTO ordersRejectionDTO);

    void adminCancelOrder(OrdersCancelDTO ordersCancelDTO);

    void deliveryOrder(Long id);

    void completeOrder(Long id);

    void remindOrder(Long id);
}
