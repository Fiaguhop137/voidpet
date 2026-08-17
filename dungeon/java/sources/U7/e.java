package U7;

import android.app.job.JobParameters;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ JobInfoSchedulerService f13330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ JobParameters f13331b;

    public /* synthetic */ e(JobInfoSchedulerService jobInfoSchedulerService, JobParameters jobParameters) {
        this.f13330a = jobInfoSchedulerService;
        this.f13331b = jobParameters;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f13330a.jobFinished(this.f13331b, false);
    }
}
