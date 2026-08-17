package io.sentry.android.replay.gestures;

import android.view.MotionEvent;
import io.sentry.android.replay.s;
import io.sentry.rrweb.e;
import io.sentry.rrweb.f;
import io.sentry.transport.o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f45446e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f45447f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f45448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LinkedHashMap f45449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f45450c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f45451d;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public b(o dateProvider) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f45448a = dateProvider;
        this.f45449b = new LinkedHashMap(10);
    }

    public final List a(MotionEvent event, s recorderConfig) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(recorderConfig, "recorderConfig");
        int actionMasked = event.getActionMasked();
        int i10 = 10;
        int i11 = 0;
        List list = null;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    long jA = this.f45448a.a();
                    long j10 = this.f45451d;
                    if (j10 != 0 && j10 + ((long) 50) > jA) {
                        return null;
                    }
                    this.f45451d = jA;
                    Set<Integer> setKeySet = this.f45449b.keySet();
                    Intrinsics.checkNotNullExpressionValue(setKeySet, "<get-keys>(...)");
                    for (Integer num : setKeySet) {
                        Intrinsics.c(num);
                        int iFindPointerIndex = event.findPointerIndex(num.intValue());
                        if (iFindPointerIndex != -1) {
                            if (this.f45450c == 0) {
                                this.f45450c = jA;
                            }
                            Object obj = this.f45449b.get(num);
                            Intrinsics.c(obj);
                            f.b bVar = new f.b();
                            bVar.i(event.getX(iFindPointerIndex) * recorderConfig.e());
                            bVar.j(event.getY(iFindPointerIndex) * recorderConfig.f());
                            bVar.f(i11);
                            bVar.g(jA - this.f45450c);
                            ((Collection) obj).add(bVar);
                        }
                        list = list;
                        i11 = 0;
                    }
                    List list2 = list;
                    long j11 = jA - this.f45450c;
                    if (j11 <= 500) {
                        return list2;
                    }
                    ArrayList arrayList = new ArrayList(this.f45449b.size());
                    Iterator it = this.f45449b.entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        int iIntValue = ((Number) entry.getKey()).intValue();
                        ArrayList<f.b> arrayList2 = (ArrayList) entry.getValue();
                        if (!arrayList2.isEmpty()) {
                            f fVar = new f();
                            fVar.f(jA);
                            ArrayList arrayList3 = new ArrayList(CollectionsKt.w(arrayList2, i10));
                            for (f.b bVar2 : arrayList2) {
                                bVar2.g(bVar2.e() - j11);
                                arrayList3.add(bVar2);
                                it = it;
                            }
                            fVar.n(arrayList3);
                            fVar.m(iIntValue);
                            arrayList.add(fVar);
                            Object obj2 = this.f45449b.get(Integer.valueOf(iIntValue));
                            Intrinsics.c(obj2);
                            ((ArrayList) obj2).clear();
                            it = it;
                            i10 = 10;
                        }
                    }
                    this.f45450c = 0L;
                    return arrayList;
                }
                if (actionMasked == 3) {
                    this.f45449b.clear();
                    e eVar = new e();
                    eVar.f(this.f45448a.a());
                    eVar.u(event.getX() * recorderConfig.e());
                    eVar.v(event.getY() * recorderConfig.f());
                    eVar.q(0);
                    eVar.s(0);
                    eVar.r(e.b.TouchCancel);
                    return CollectionsKt.e(eVar);
                }
                if (actionMasked != 5) {
                    if (actionMasked != 6) {
                        return null;
                    }
                }
            }
            int pointerId = event.getPointerId(event.getActionIndex());
            int iFindPointerIndex2 = event.findPointerIndex(pointerId);
            if (iFindPointerIndex2 == -1) {
                return null;
            }
            this.f45449b.remove(Integer.valueOf(pointerId));
            e eVar2 = new e();
            eVar2.f(this.f45448a.a());
            eVar2.u(event.getX(iFindPointerIndex2) * recorderConfig.e());
            eVar2.v(event.getY(iFindPointerIndex2) * recorderConfig.f());
            eVar2.q(0);
            eVar2.s(pointerId);
            eVar2.r(e.b.TouchEnd);
            return CollectionsKt.e(eVar2);
        }
        int pointerId2 = event.getPointerId(event.getActionIndex());
        int iFindPointerIndex3 = event.findPointerIndex(pointerId2);
        if (iFindPointerIndex3 == -1) {
            return null;
        }
        this.f45449b.put(Integer.valueOf(pointerId2), new ArrayList(10));
        e eVar3 = new e();
        eVar3.f(this.f45448a.a());
        eVar3.u(event.getX(iFindPointerIndex3) * recorderConfig.e());
        eVar3.v(event.getY(iFindPointerIndex3) * recorderConfig.f());
        eVar3.q(0);
        eVar3.s(pointerId2);
        eVar3.r(e.b.TouchStart);
        return CollectionsKt.e(eVar3);
    }
}
