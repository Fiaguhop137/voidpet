package Pc;

import android.content.Context;
import java.io.File;
import kotlin.io.j;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f8880b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f8881a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f8881a = context;
    }

    public final String a() {
        if (b().exists()) {
            return j.l(b(), null, 1, null);
        }
        return null;
    }

    protected final File b() {
        return new File(this.f8881a.getNoBackupFilesDir(), "expo_notifications_registration_info.txt");
    }

    public final void c(String str) {
        b().delete();
        if (str != null) {
            j.n(b(), str, null, 2, null);
        }
    }
}
