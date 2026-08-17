package Cc;

import android.app.NotificationChannelGroup;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class e implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private u f1831a;

    public e(u uVar) {
        this.f1831a = uVar;
    }

    private ArrayList c(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f1831a.a(Ac.i.a(it.next())));
        }
        return arrayList;
    }

    @Override // Cc.t
    public Bundle a(NotificationChannelGroup notificationChannelGroup) {
        if (notificationChannelGroup == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("id", b(notificationChannelGroup));
        bundle.putString("name", notificationChannelGroup.getName().toString());
        if (Build.VERSION.SDK_INT >= 28) {
            bundle.putString("description", notificationChannelGroup.getDescription());
            bundle.putBoolean("isBlocked", notificationChannelGroup.isBlocked());
        }
        bundle.putParcelableArrayList("channels", c(notificationChannelGroup.getChannels()));
        return bundle;
    }

    protected String b(NotificationChannelGroup notificationChannelGroup) {
        return notificationChannelGroup.getId();
    }
}
