package com.campus.controller.user;

import com.campus.dto.OrdersPageQueryDTO;
import com.campus.dto.OrdersPaymentDTO;
import com.campus.dto.OrdersSubmitDTO;
import com.campus.result.PageResult;
import com.campus.result.Result;
import com.campus.service.OrderService;
import com.campus.vo.OrderPaymentVO;
import com.campus.vo.OrderSubmitVO;
import com.campus.vo.OrderVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController("UserOrderController")
@Slf4j
@Api(tags = "订单相关接口")
@Validated
@RequestMapping("/user/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/submit")
    @ApiOperation("提交订单接口")
    public Result<OrderSubmitVO> submit(@RequestBody @Validated OrdersSubmitDTO ordersSubmitDTO) {
        log.info("提交订单: {}", ordersSubmitDTO);
        OrderSubmitVO submitVO = orderService.submit(ordersSubmitDTO);
        return Result.success(submitVO);
    }

    @PutMapping("/payment")
    @ApiOperation("订单支付")
    public Result<OrderPaymentVO> payment(@RequestBody @Validated OrdersPaymentDTO ordersPaymentDTO) {
        log.info("订单支付：{}", ordersPaymentDTO);
        orderService.payment(ordersPaymentDTO);
        return Result.success();
    }

    @GetMapping("/historyOrders")
    @ApiOperation("查询历史订单")
    public Result<PageResult<OrderVO>> getHistoryOrders(OrdersPageQueryDTO ordersPageQueryDTO) {
        log.info("历史订单查询: {}", ordersPageQueryDTO);
        PageResult<OrderVO> orderVOPageResult = orderService.getHistoryOrders(ordersPageQueryDTO);
        return Result.success(orderVOPageResult);
    }

    @GetMapping("/orderDetail/{id}")
    @ApiOperation("查询订单详情")
    public Result<OrderVO> getOrderDetail(@PathVariable @ApiParam(value = "订单id", required = true) Long id) {
        log.info("查询订单详情，ID：{}", id);
        OrderVO orderVO = orderService.getUserOrderDetail(id);
        return Result.success(orderVO);
    }

    @PostMapping("/repetition/{id}")
    @ApiOperation("再次下单")
    public Result<?> repeatOrder(@PathVariable @ApiParam(value = "订单ID", required = true) Long id) {
        log.info("再次下单，ID：{}", id);
        orderService.repeatOrder(id);
        return Result.success();
    }

    @PutMapping("/cancel/{id}")
    @ApiOperation("取消订单")
    public Result<?> cancelOrder(@PathVariable Long id) {
        log.info("取消订单，ID: {}", id);
        orderService.userCancelOrder(id);
        return Result.success();
    }

    @GetMapping("/reminder/{id}")
    @ApiOperation("催单")
    public Result<?> remindOrder(@PathVariable Long id) {
        log.info("催单，ID：{}", id);
        orderService.remindOrder(id);
        return Result.success();
    }
}
