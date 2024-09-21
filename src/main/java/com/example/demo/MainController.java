package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/") // ホーム
    public String mainGet() {
        return "index";
    }
    @GetMapping("/logged_in") // ホーム
    public String LoggedInGet() {
        return "logged_in";
    }

//    @GetMapping("/chat") 
//    public String chatGet(Model model) {
//        List<Comment> comments = commentService.getAllComments();// commentServiceのgetAllCommentsの処理を走らせる
//        model.addAttribute("comments", comments);
//        return "chat";
//    }
    
    // /api/add-comment のエンドポイントを削除競合しちゃった
    // @PostMapping("/api/add-comment")
    // @ResponseBody
    // public void addComment(@RequestBody Comment comment) {
    //     commentService.saveComment(comment);
    // }
    
}