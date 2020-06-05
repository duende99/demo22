package com.demo22.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 主页控制器
 *
 * @author dizhang
 *
 */
@Controller
public class PageController {

    /**
     * 跳转图片分類管理页面
     */
    @RequestMapping("/test2")
    public String test() {

        return "a1";
    }

    /**
     * 判断用户是否登陆 登陆则进入index页面 没有则跳转 login页面
     *
     * @param session
     * @return
     */
//    @RequestMapping("/pageIndex")
//    public String pageIndex(HttpSession session) {
//        if (isLogin(session)) {
//            return "index";
//        } else {
//            return "login";
//        }
//    }

//    @RequestMapping("/")
//    public String login(HttpSession session) {
//        return "login";
//    }

    /**
     * 跳转图片管理页面
     */
//    @RequestMapping("/pictureManageType")
//    public String pictureManageType(HttpSession session) {
//        if (isLogin(session)) {
//            return "picture_manage/pic_type";
//        }
//        return "login";
//
//    }

//    @ResponseBody
//    @GetMapping("/qrCode/{num}")
//    public Response qrCode(@PathVariable("num") String num) {
//        System.out.println(num);
//        QrCode qrCode = qrCodeService.selectByNum(num);
//        if (qrCode == null) {
//            return renderError("沒有找到用戶信息");
//        }
//        WOrder order = orderService.selectById(qrCode.getOrderId());
//        if (order.getsStatus()==1) {
//            return renderError("沒有找到用戶信息");
//        }
//        WShopLocation shopLocation = shopLocationService.selectById(order.getShopLocationId());
//        Map<String,Object> resultMap = new HashMap<String,Object>();
//        resultMap.put("location", shopLocation.getShopName());
//        resultMap.put("orderSn", order.getOrderSnIbs());
//        resultMap.put("qrCodeData", ZXingCode.getLogoQRCode(order.getOrderSnIbs(), null, ""));
//        resultMap.put("count", qrCode.getCount());
//        return renderSuccess(resultMap);
//
//    }


//    @ResponseBody
//    @RequestMapping("/qrCodePhone")
//    public Response qrCodePhone(@RequestParam("MESSAGE") String MESSAGE) {
//        JSONObject paramJson = JsonParseUtil.parseRequestParam(MESSAGE);
//
//        // 用户ID
//        String  ordersn = paramJson.getString("ordersn");
//        WOrder order = orderService.getOrderByOrderSn(ordersn);
//        if (order == null) {
//            return renderError("沒有找到用戶信息");
//        }
//        if(order.getType()!=1)
//        {
//            return renderError("该訂單不是門市取貨訂單 無法生成二維碼");
//        }
//        WShopLocation shopLocation = shopLocationService.selectById(order.getShopLocationId());
//        Map<String,Object> resultMap = new HashMap<String,Object>();
//        resultMap.put("order", order);
//        resultMap.put("shop",shopLocation);
//        resultMap.put("qrCodeData", ZXingCode.getLogoQRCode(order.getOrderSnIbs(), null, ""));
//        return renderSuccess(resultMap);
//    }

}