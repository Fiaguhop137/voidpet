package U7;

import V7.InterfaceC1561d;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Adler32;

/* JADX INFO: loaded from: classes2.dex */
public class d implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f13327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC1561d f13328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f13329c;

    public d(Context context, InterfaceC1561d interfaceC1561d, f fVar) {
        this.f13327a = context;
        this.f13328b = interfaceC1561d;
        this.f13329c = fVar;
    }

    private boolean d(JobScheduler jobScheduler, int i10, int i11) {
        for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
            int i12 = jobInfo.getExtras().getInt("attemptNumber");
            if (jobInfo.getId() == i10) {
                if (i12 >= i11) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // U7.x
    public void a(N7.o oVar, int i10, boolean z10) {
        ComponentName componentName = new ComponentName(this.f13327a, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.f13327a.getSystemService("jobscheduler");
        int iC = c(oVar);
        if (!z10 && d(jobScheduler, iC, i10)) {
            R7.a.b("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", oVar);
            return;
        }
        long jX1 = this.f13328b.x1(oVar);
        JobInfo.Builder builderC = this.f13329c.c(new JobInfo.Builder(iC, componentName), oVar.d(), jX1, i10);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i10);
        persistableBundle.putString("backendName", oVar.b());
        persistableBundle.putInt("priority", Y7.a.a(oVar.d()));
        if (oVar.c() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(oVar.c(), 0));
        }
        builderC.setExtras(persistableBundle);
        R7.a.c("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", oVar, Integer.valueOf(iC), Long.valueOf(this.f13329c.g(oVar.d(), jX1, i10)), Long.valueOf(jX1), Integer.valueOf(i10));
        jobScheduler.schedule(builderC.build());
    }

    @Override // U7.x
    public void b(N7.o oVar, int i10) {
        a(oVar, i10, false);
    }

    int c(N7.o oVar) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.f13327a.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(oVar.b().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(Y7.a.a(oVar.d())).array());
        if (oVar.c() != null) {
            adler32.update(oVar.c());
        }
        return (int) adler32.getValue();
    }
}
