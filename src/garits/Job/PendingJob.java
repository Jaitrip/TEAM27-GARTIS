/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garits.Job;

import java.util.List;

/**
 *
 * @author jaimik
 */
public class PendingJob {
    private List<Job> pendingJobs;

    public PendingJob(List<Job> pendingJobs) {
        this.pendingJobs = pendingJobs;
    }
    
    public List<Job> getPendingJobs() {
        return pendingJobs;
    }

    public void setPendingJobs(List<Job> pendingJobs) {
        this.pendingJobs = pendingJobs;
    }
    
    
}
