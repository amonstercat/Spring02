package com.lzc.study.controller;


import com.lzc.study.entity.Player;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class ParameterController {

    @RequestMapping(value = "/player/{playerId}")
    public  String findPlayerById(@PathVariable("playerId") Integer playid)
    {
        System.out.println("player's id is"+playid);
        return  "success";
    }
    @GetMapping (value = "/player/{playerId}/{playerName}")
    public  String findPlayer(
            @PathVariable("playerId") Integer playerid,
            @PathVariable("playerName") String playername,
            @PathVariable Map<String,String> resultMap  //把所有路径变量的KV存放在该Map中
     )
    {
        System.out.println("player's"+playerid+playername);
        System.out.println(resultMap);
        return  "success";
    }

    @RequestMapping("/param")
    public String testRequestParam(@RequestParam("name") String pname,
                                   @RequestParam(value = "age",required = false) Integer page)
    {
        System.out.println(pname+page);
          return  "ok";
    }
    @PostMapping("/saveBatch")
    public String testRequestBody(@RequestBody List<Player> playerList)
    {
        playerList.forEach(System.out::println);
        return  "saveBatch SUCCESS";
    }
}
