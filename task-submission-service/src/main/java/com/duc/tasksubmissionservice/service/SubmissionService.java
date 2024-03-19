package com.duc.tasksubmissionservice.service;

import com.duc.tasksubmissionservice.model.Submission;

import java.util.List;

public interface SubmissionService {
    Submission submitTask(Long taskId, String githubLink, Long userId, String jwt) throws Exception;

    Submission getTaskSubmissionById(Long submissionId) throws Exception;

    List<Submission> getAllTasksSubmission();

    List<Submission> getTaskSubmissionByTaskId(Long taskId);

    Submission acceptDeclineSubmission(Long id, String status) throws Exception;
}
