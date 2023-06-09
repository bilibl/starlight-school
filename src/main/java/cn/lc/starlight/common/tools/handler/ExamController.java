package cn.lc.starlight.common.tools.handler;

//import cn.lc.starlight.sys.entity.Exam;
//import cn.lc.starlight.sys.entity.Question;
//import cn.lc.starlight.sys.entity.Result;
//import cn.lc.starlight.sys.mapper.ExamMapper;
//import cn.lc.starlight.sys.mapper.QuestionMapper;
//import cn.lc.starlight.sys.service.ExamService;
//import cn.lc.starlight.sys.service.QuestionService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@RestController
//@RequestMapping("/sys/exam")
//public class ExamController {
//
//    @Autowired
//    private ExamService examService;
//
//    @Autowired
//    private QuestionService questionService;
//
//    @ApiOperation(value = "获取试卷")
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "examId", paramType = "query", value = "试卷ID", required = true)
//    })
//    @RequestMapping(method = RequestMethod.POST, value = "/getExamPaper")
//    public Result getExamPaper(String examId) {
//        Result result = new Result();
//        try {
//            // 根据试卷ID获取试卷对象
//            Exam exam = examService.getExamById(examId);
//
//            // 根据试卷ID获取试题列表
//            List<Question> questions = questionService.getQuestionsByExamId(examId);
//
//            // 将试题列表设置到试卷对象中
//            exam.setQuestions(questions);
//
//            // 将试卷作为返回数据
//            result.setData(exam);
//            result.success("成功获取试卷！");
//        } catch (Exception e) {
//            result.error("获取试卷失败：" + e.getMessage());
//        }
//        return result;
//    }
//
//    @ApiOperation(value = "自动阅卷")
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "examId", paramType = "query", value = "试卷ID", required = true),
//            @ApiImplicitParam(name = "answers", paramType = "query", value = "答案列表，每个答案格式为questionId:answer", required = true)
//    })
//    @RequestMapping(method = RequestMethod.POST, value = "/autoGrade")
//    public Result autoGrade(String examId, String[] answers) {
//        Result result = new Result();
//        try {
//            // 根据试卷ID获取试卷对象
//            Exam exam = examService.getExamById(examId);
//
//            // 根据试卷ID获取试题列表
//            List<Question> questions = questionService.getQuestionsByExamId(examId);
//
//            int totalScore = 0; // 总分
//            int obtainedScore = 0; // 获得的分数
//
//            for (String answer : answers) {
//                String[] parts = answer.split(":");
//                if (parts.length == 2) {
//                    String questionId = parts[0]; // 从答案中提取问题ID
//                    String userAnswer = parts[1]; // 从答案中提取用户的答案
//
//                    for (Question question : questions) {
//                        if (question.getId().equals(questionId)) {
//                            totalScore += question.getScore(); // 将问题的分数累加到总分
//
//                            // 检查用户的答案是否与正确答案相符
//                            if (question.getAnswer().equals(userAnswer)) {
//                                obtainedScore += question.getScore(); // 累加获得的分数
//                            }
//                        }
//                    }
//                }
//
//                // 计算得分率
//                double scoreRate = (double) obtainedScore / totalScore;
//
//                // 更新试卷对象的得分信息
//                exam.setTotalScore(totalScore);
//                exam.setObtainedScore(obtainedScore);
//                exam.setScoreRate(scoreRate);
//
//                // 更新试卷得分信息
//                examService.updateExamScore(exam);
//
//                result.success("自动阅卷完成！得分率：" + scoreRate);
//            }catch(Exception e){
//                result.error("自动阅卷失败：" + e.getMessage());
//            }
//            return result;
//        }
//    }
//}