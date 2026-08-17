package expo.modules.notifications;

import Ac.f;
import Rc.d;
import android.content.Context;
import expo.modules.core.BasePackage;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p408wc.b;
import p462zc.a;

/* JADX INFO: loaded from: classes2.dex */
public class NotificationsPackage extends BasePackage {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b f41089a = new b();

    @Override // expo.modules.core.BasePackage, p227mb.g
    public List b(Context context) {
        return Collections.singletonList(new d(this.f41089a));
    }

    @Override // expo.modules.core.BasePackage, p227mb.g
    public List c(Context context) {
        return Arrays.asList(this.f41089a);
    }

    @Override // expo.modules.core.BasePackage, p227mb.g
    public List f(Context context) {
        return Arrays.asList(new f(context), new a());
    }
}
