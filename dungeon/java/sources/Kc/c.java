package Kc;

import Rb.u;
import android.content.Context;
import android.os.Bundle;
import android.os.ResultReceiver;
import expo.modules.notifications.service.NotificationsService;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.o;
import org.jetbrains.annotations.NotNull;
import p013ac.j;
import p013ac.k;
import p013ac.m;
import p013ac.t;
import p157ic.C3594b;
import p157ic.C3596d;
import p157ic.P;
import p157ic.a0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\u000b\u001a\u00020\n2\u001e\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0004j\u0002`\bH\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u001b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0014¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u001e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"LKc/c;", "Lcc/c;", "<init>", "()V", "Lkotlin/Function2;", "", "Landroid/os/Bundle;", "", "Lexpo/modules/notifications/ResultReceiverBody;", "body", "Landroid/os/ResultReceiver;", "x", "(Lkotlin/jvm/functions/Function2;)Landroid/os/ResultReceiver;", "Lcc/e;", "j", "()Lcc/e;", "", "identifier", "LRb/u;", "promise", "A", "(Ljava/lang/String;LRb/u;)V", "y", "(LRb/u;)V", "", "LIc/a;", "notifications", "", "D", "(Ljava/util/Collection;)Ljava/util/List;", "Landroid/content/Context;", "C", "()Landroid/content/Context;", "context", "expo-notifications_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class c extends p049cc.c {

    static final class a implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ u f6170a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c f6171b;

        a(u uVar, c cVar) {
            this.f6170a = uVar;
            this.f6171b = cVar;
        }

        public final void a(int i10, Bundle bundle) {
            ArrayList parcelableArrayList = bundle != null ? bundle.getParcelableArrayList("notifications") : null;
            if (i10 == 0 && parcelableArrayList != null) {
                this.f6170a.i(this.f6171b.D(parcelableArrayList));
            } else {
                Serializable serializable = bundle != null ? bundle.getSerializable("exception") : null;
                this.f6170a.reject("ERR_NOTIFICATIONS_FETCH_FAILED", "A list of displayed notifications could not be fetched.", serializable instanceof Exception ? (Exception) serializable : null);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a(((Number) obj).intValue(), (Bundle) obj2);
            return Unit.f48228a;
        }
    }

    public static final class b implements Function2 {
        public b() {
        }

        public final void a(Object[] objArr, u promise) throws Zb.i {
            Intrinsics.checkNotNullParameter(objArr, "<unused var>");
            Intrinsics.checkNotNullParameter(promise, "promise");
            NotificationsService.Companion companion = NotificationsService.INSTANCE;
            Context contextC = c.this.C();
            c cVar = c.this;
            companion.i(contextC, cVar.x(new a(promise, cVar)));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws Zb.i {
            a((Object[]) obj, (u) obj2);
            return Unit.f48228a;
        }
    }

    /* JADX INFO: renamed from: Kc.c$c, reason: collision with other inner class name */
    public static final class C0115c implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0115c f6173a = new C0115c();

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o invoke() {
            return F.n(u.class);
        }
    }

    public static final class d implements Function1 {
        public d() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) throws Zb.i {
            Intrinsics.checkNotNullParameter(objArr, "<destruct>");
            u uVar = (u) objArr[0];
            NotificationsService.Companion companion = NotificationsService.INSTANCE;
            Context contextC = c.this.C();
            c cVar = c.this;
            companion.i(contextC, cVar.x(new a(uVar, cVar)));
            return Unit.f48228a;
        }
    }

    public static final class e implements Function2 {
        public e() {
        }

        public final void a(Object[] objArr, u promise) {
            Intrinsics.checkNotNullParameter(objArr, "<unused var>");
            Intrinsics.checkNotNullParameter(promise, "promise");
            c.this.y(promise);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (u) obj2);
            return Unit.f48228a;
        }
    }

    public static final class f implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f6176a = new f();

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o invoke() {
            return F.n(u.class);
        }
    }

    public static final class g implements Function1 {
        public g() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            Intrinsics.checkNotNullParameter(objArr, "<destruct>");
            c.this.y((u) objArr[0]);
            return Unit.f48228a;
        }
    }

    public static final class h implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f6178a = new h();

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o invoke() {
            return F.n(String.class);
        }
    }

    public static final class i implements Function2 {
        public i() {
        }

        public final void a(Object[] objArr, u promise) {
            Intrinsics.checkNotNullParameter(objArr, "<destruct>");
            Intrinsics.checkNotNullParameter(promise, "promise");
            c.this.A((String) objArr[0], promise);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (u) obj2);
            return Unit.f48228a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B(u uVar, int i10, Bundle bundle) {
        if (i10 == 0) {
            uVar.resolve((Object) null);
        } else {
            Serializable serializable = bundle != null ? bundle.getSerializable("exception") : null;
            uVar.reject("ERR_NOTIFICATION_DISMISSAL_FAILED", "Notification could not be dismissed.", serializable instanceof Exception ? (Exception) serializable : null);
        }
        return Unit.f48228a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Context C() throws Zb.i {
        Context contextA = f().A();
        if (contextA != null) {
            return contextA;
        }
        throw new Zb.i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z(u uVar, int i10, Bundle bundle) {
        if (i10 == 0) {
            uVar.resolve((Object) null);
        } else {
            Serializable serializable = bundle != null ? bundle.getSerializable("exception") : null;
            uVar.reject("ERR_NOTIFICATIONS_DISMISSAL_FAILED", "Notifications could not be dismissed.", serializable instanceof Exception ? (Exception) serializable : null);
        }
        return Unit.f48228a;
    }

    protected void A(String identifier, u promise) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(promise, "promise");
        NotificationsService.INSTANCE.e(C(), new String[]{identifier}, x(new Kc.a(promise)));
    }

    protected List D(Collection notifications) {
        Intrinsics.checkNotNullParameter(notifications, "notifications");
        Collection collection = notifications;
        ArrayList arrayList = new ArrayList(CollectionsKt.w(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(p408wc.c.b((Ic.a) it.next()));
        }
        return arrayList;
    }

    @Override // p049cc.c
    @NotNull
    public p049cc.e j() {
        p013ac.e oVar;
        p013ac.e fVar;
        p013ac.e oVar2;
        p013ac.e fVar2;
        p381v3.a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            p049cc.d dVar = new p049cc.d(this);
            dVar.u("ExpoNotificationPresenter");
            boolean zB = Intrinsics.b(u.class, u.class);
            Class cls = Float.TYPE;
            Class cls2 = Double.TYPE;
            Class cls3 = Boolean.TYPE;
            Class cls4 = Integer.TYPE;
            if (zB) {
                fVar = new p013ac.f("getPresentedNotificationsAsync", new C3594b[0], new b());
            } else {
                a0 a0VarO = dVar.o();
                C3594b c3594b = (C3594b) C3596d.f43900a.a().get(new Pair(F.b(u.class), Boolean.FALSE));
                if (c3594b == null) {
                    c3594b = new C3594b(new P(F.b(u.class), false, C0115c.f6173a), a0VarO);
                }
                C3594b[] c3594bArr = {c3594b};
                d dVar2 = new d();
                if (Intrinsics.b(Unit.class, cls4)) {
                    oVar = new m("getPresentedNotificationsAsync", c3594bArr, dVar2);
                } else if (Intrinsics.b(Unit.class, cls3)) {
                    oVar = new p013ac.h("getPresentedNotificationsAsync", c3594bArr, dVar2);
                } else if (Intrinsics.b(Unit.class, cls2)) {
                    oVar = new j("getPresentedNotificationsAsync", c3594bArr, dVar2);
                } else if (Intrinsics.b(Unit.class, cls)) {
                    oVar = new k("getPresentedNotificationsAsync", c3594bArr, dVar2);
                } else {
                    oVar = Intrinsics.b(Unit.class, String.class) ? new p013ac.o("getPresentedNotificationsAsync", c3594bArr, dVar2) : new t("getPresentedNotificationsAsync", c3594bArr, dVar2);
                }
                fVar = oVar;
            }
            dVar.m().put("getPresentedNotificationsAsync", fVar);
            a0 a0VarO2 = dVar.o();
            C3596d c3596d = C3596d.f43900a;
            kotlin.reflect.d dVarB = F.b(String.class);
            Boolean bool = Boolean.FALSE;
            C3594b c3594b2 = (C3594b) c3596d.a().get(new Pair(dVarB, bool));
            if (c3594b2 == null) {
                c3594b2 = new C3594b(new P(F.b(String.class), false, h.f6178a), a0VarO2);
            }
            dVar.m().put("dismissNotificationAsync", new p013ac.f("dismissNotificationAsync", new C3594b[]{c3594b2}, new i()));
            if (Intrinsics.b(u.class, u.class)) {
                fVar2 = new p013ac.f("dismissAllNotificationsAsync", new C3594b[0], new e());
            } else {
                a0 a0VarO3 = dVar.o();
                C3594b c3594b3 = (C3594b) c3596d.a().get(new Pair(F.b(u.class), bool));
                if (c3594b3 == null) {
                    c3594b3 = new C3594b(new P(F.b(u.class), false, f.f6176a), a0VarO3);
                }
                C3594b[] c3594bArr2 = {c3594b3};
                g gVar = new g();
                if (Intrinsics.b(Unit.class, cls4)) {
                    oVar2 = new m("dismissAllNotificationsAsync", c3594bArr2, gVar);
                } else if (Intrinsics.b(Unit.class, cls3)) {
                    oVar2 = new p013ac.h("dismissAllNotificationsAsync", c3594bArr2, gVar);
                } else if (Intrinsics.b(Unit.class, cls2)) {
                    oVar2 = new j("dismissAllNotificationsAsync", c3594bArr2, gVar);
                } else if (Intrinsics.b(Unit.class, cls)) {
                    oVar2 = new k("dismissAllNotificationsAsync", c3594bArr2, gVar);
                } else {
                    oVar2 = Intrinsics.b(Unit.class, String.class) ? new p013ac.o("dismissAllNotificationsAsync", c3594bArr2, gVar) : new t("dismissAllNotificationsAsync", c3594bArr2, gVar);
                }
                fVar2 = oVar2;
            }
            dVar.m().put("dismissAllNotificationsAsync", fVar2);
            return dVar.w();
        } finally {
            p381v3.a.f();
        }
    }

    protected final ResultReceiver x(Function2 body) {
        Intrinsics.checkNotNullParameter(body, "body");
        return p372uc.e.b(null, body);
    }

    protected void y(u promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        NotificationsService.INSTANCE.f(C(), x(new Kc.b(promise)));
    }
}
