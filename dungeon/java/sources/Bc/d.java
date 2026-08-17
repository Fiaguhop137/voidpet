package Bc;

import android.app.NotificationChannelGroup;
import android.content.Context;
import android.os.Build;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class d implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Y0.p f652a;

    public d(Context context) {
        this.f652a = Y0.p.h(context);
    }

    @Override // Bc.r
    public NotificationChannelGroup a(String str, CharSequence charSequence, p191kb.b bVar) {
        NotificationChannelGroup notificationChannelGroupA = a.a(str, charSequence);
        e(notificationChannelGroupA, bVar);
        this.f652a.e(notificationChannelGroupA);
        return notificationChannelGroupA;
    }

    @Override // Bc.r
    public List b() {
        return this.f652a.m();
    }

    @Override // Bc.r
    public NotificationChannelGroup c(String str) {
        return this.f652a.l(str);
    }

    @Override // Bc.r
    public void d(String str) {
        this.f652a.g(str);
    }

    protected void e(Object obj, p191kb.b bVar) {
        if (b.a(obj)) {
            NotificationChannelGroup notificationChannelGroupA = Y0.o.a(obj);
            if (Build.VERSION.SDK_INT < 28 || !bVar.g("description")) {
                return;
            }
            notificationChannelGroupA.setDescription(bVar.getString("description"));
        }
    }
}
