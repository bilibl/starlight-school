package cn.lc.starlight.common.utils;


import cn.lc.starlight.common.constants.Result;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sys")
public class phoneVCode {

    @RequestMapping(method = RequestMethod.POST, value = "/getVCode")
    public Result loginByPhone(String phone) {

        Result result = new Result();
        int num = 1000 + (int) (Math.random() * (9999 - 1000 + 1));
        result.setData(num);

        return result;

    }


}
