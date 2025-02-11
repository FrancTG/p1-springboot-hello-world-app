package demoapp.controller;

import demoapp.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class DemoController {

    @Autowired
    private DemoService service;

    @GetMapping("/demoForm")
    public String demoForm(DemoData demoData) {
        return "demoForm";
    }

    @PostMapping("/demoForm")
    public String checkPersonInfo(@ModelAttribute @Valid DemoData demoData, BindingResult bindingResult, Model model) {
        /*if (bindingResult.hasErrors()) {
            return "demoForm";
        }*/

        model.addAttribute("isPalindrome", service.isPalindrome(demoData.getPalindrome()));
        model.addAttribute("isEvenNum", service.isEvenNum(demoData.getEvenNum()));
        model.addAttribute("isSqrt", service.isSqrt(demoData.getSqrt(), demoData.getSqrtChk()));
        model.addAttribute("calcResult", service.calculator(demoData.getCalculator()));
        return "demoResults";
    }
}
