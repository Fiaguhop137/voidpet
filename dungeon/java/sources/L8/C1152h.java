package L8;

import android.app.Application;
import com.google.android.gms.tasks.Task;
import java.util.Objects;

/* JADX INFO: renamed from: L8.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1152h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC1162m f6467a;

    private C1152h(InterfaceC1162m interfaceC1162m) {
        this.f6467a = interfaceC1162m;
    }

    public static C1152h a(Application application) {
        return new C1152h(AbstractC1166o.a(application));
    }

    public final Task b(InterfaceC1150g interfaceC1150g) {
        Objects.requireNonNull(interfaceC1150g);
        return this.f6467a.c(new C1148f(interfaceC1150g));
    }
}
