package p070df;

import Gd.a;
import java.util.concurrent.TimeUnit;
import kotlin.enums.EnumEntries;

/* JADX INFO: loaded from: classes3.dex */
public enum b {
    NANOSECONDS(TimeUnit.NANOSECONDS),
    MICROSECONDS(TimeUnit.MICROSECONDS),
    MILLISECONDS(TimeUnit.MILLISECONDS),
    SECONDS(TimeUnit.SECONDS),
    MINUTES(TimeUnit.MINUTES),
    HOURS(TimeUnit.HOURS),
    DAYS(TimeUnit.DAYS);


    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f40199j = a.a(e());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TimeUnit f40200a;

    b(TimeUnit timeUnit) {
        this.f40200a = timeUnit;
    }

    public final TimeUnit g() {
        return this.f40200a;
    }
}
