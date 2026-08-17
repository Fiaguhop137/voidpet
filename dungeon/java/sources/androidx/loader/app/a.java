package androidx.loader.app;

import android.os.Bundle;
import androidx.lifecycle.InterfaceC1994q;
import androidx.lifecycle.U;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: androidx.loader.app.a$a, reason: collision with other inner class name */
    public interface InterfaceC0304a {
        void a(Q1.b bVar, Object obj);

        Q1.b b(int i10, Bundle bundle);

        void c(Q1.b bVar);
    }

    public static a b(InterfaceC1994q interfaceC1994q) {
        return new b(interfaceC1994q, ((U) interfaceC1994q).g());
    }

    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract Q1.b c(int i10, Bundle bundle, InterfaceC0304a interfaceC0304a);

    public abstract void d();
}
