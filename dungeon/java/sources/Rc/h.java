package Rc;

import android.content.Context;
import android.os.Bundle;
import com.google.firebase.messaging.T;
import expo.modules.interfaces.taskManager.TaskServiceProviderHelper;
import expo.modules.notifications.service.NotificationsService;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.WeakHashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public class h implements Sc.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f11004c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f11007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f11003b = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final WeakHashMap f11005d = new WeakHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static WeakHashMap f11006e = new WeakHashMap();

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(Uc.a listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            if (e().containsKey(listener)) {
                return;
            }
            e().put(listener, new WeakReference(listener));
            String strD = d();
            if (strD != null) {
                listener.a(strD);
            }
        }

        public final List b() {
            Collection collectionValues = c().values();
            Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
            ArrayList arrayList = new ArrayList();
            Iterator it = collectionValues.iterator();
            while (it.hasNext()) {
                android.support.v4.media.session.b.a(((WeakReference) it.next()).get());
            }
            return arrayList;
        }

        protected final WeakHashMap c() {
            return h.f11006e;
        }

        protected final String d() {
            return h.f11004c;
        }

        protected final WeakHashMap e() {
            return h.f11005d;
        }

        public final void f(Context applicationContext, Bundle bundle) {
            Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            TaskServiceProviderHelper.f40999a.getTaskServiceImpl(applicationContext);
            Iterator it = b().iterator();
            if (it.hasNext()) {
                android.support.v4.media.session.b.a(it.next());
                throw null;
            }
        }
    }

    public h(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f11007a = context;
    }

    @Override // Sc.b
    public void a(String token) {
        Uc.a aVar;
        Intrinsics.checkNotNullParameter(token, "token");
        for (WeakReference weakReference : f11005d.values()) {
            if (weakReference != null && (aVar = (Uc.a) weakReference.get()) != null) {
                aVar.a(token);
            }
        }
        f11004c = token;
    }

    @Override // Sc.b
    public void b() {
        NotificationsService.INSTANCE.o(this.f11007a);
    }

    @Override // Sc.b
    public void c(T remoteMessage) {
        Intrinsics.checkNotNullParameter(remoteMessage, "remoteMessage");
        Dc.a aVar = Dc.a.f2401a;
        aVar.c("FirebaseMessagingDelegate.onMessageReceived: message", remoteMessage);
        Ic.a aVarG = g(remoteMessage);
        aVar.b("FirebaseMessagingDelegate.onMessageReceived: notification", aVarG);
        NotificationsService.Companion.t(NotificationsService.INSTANCE, this.f11007a, aVarG, null, 4, null);
        a aVar2 = f11003b;
        Context applicationContext = this.f11007a.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        Bundle bundleB = p408wc.d.b(remoteMessage);
        Intrinsics.checkNotNullExpressionValue(bundleB, "toBundle(...)");
        aVar2.f(applicationContext, bundleB);
    }

    protected final Ic.a g(T remoteMessage) {
        Intrinsics.checkNotNullParameter(remoteMessage, "remoteMessage");
        return new Ic.a(h(i(remoteMessage), new Ic.i(remoteMessage), new Jc.a(remoteMessage)), new Date(remoteMessage.j4()));
    }

    protected Ic.g h(String identifier, Hc.a content, Jc.a notificationTrigger) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(notificationTrigger, "notificationTrigger");
        return new Ic.g(identifier, content, notificationTrigger);
    }

    protected final String i(T remoteMessage) {
        Intrinsics.checkNotNullParameter(remoteMessage, "remoteMessage");
        String str = (String) remoteMessage.b4().get("tag");
        if (str != null) {
            return str;
        }
        String strD4 = remoteMessage.d4();
        if (strD4 != null) {
            return strD4;
        }
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
