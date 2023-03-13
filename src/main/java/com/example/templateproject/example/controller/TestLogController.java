package com.example.templateproject.example.controller;

import com.example.templateproject.example.service.TestLogService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test/log")
@RequiredArgsConstructor
@Slf4j
public class TestLogController {

    private final TestLogService testLogService;

    @GetMapping("basic")
    public void log(){
        testLogService.logging();
    }

    @GetMapping("slack")
    public void slackLog(){
        testLogService.logging();
    }
}
