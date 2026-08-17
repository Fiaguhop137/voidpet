package io.sentry.android.replay;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import io.sentry.InterfaceC3698e0;
import io.sentry.util.C3799a;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class p implements Closeable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f45480e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f45481f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f45482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C3799a f45483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CopyOnWriteArrayList f45484c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ArrayList f45485d;

    public static final class a {

        /* JADX INFO: renamed from: io.sentry.android.replay.p$a$a, reason: collision with other inner class name */
        static final class C0533a extends kotlin.jvm.internal.o implements Function1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ p f45486a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0533a(p pVar) {
                super(1);
                this.f45486a = pVar;
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ArrayList invoke(ArrayList mViews) throws Exception {
                Intrinsics.checkNotNullParameter(mViews, "mViews");
                InterfaceC3698e0 interfaceC3698e0A = this.f45486a.f45483b.a();
                try {
                    ArrayList arrayList = this.f45486a.f45485d;
                    arrayList.addAll(mViews);
                    Kd.a.a(interfaceC3698e0A, null);
                    return arrayList;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        Kd.a.a(interfaceC3698e0A, th);
                        throw th2;
                    }
                }
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(p pVar) {
            if (pVar.f45482a.get()) {
                return;
            }
            v.f45592a.e(new C0533a(pVar));
        }

        public final p b() {
            p pVar = new p(null);
            new Handler(Looper.getMainLooper()).postAtFrontOfQueue(new o(pVar));
            return pVar;
        }
    }

    public static final class b extends ArrayList {
        b() {
        }

        @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean addAll(Collection elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            for (e eVar : p.this.d()) {
                Iterator it = elements.iterator();
                while (it.hasNext()) {
                    eVar.a((View) it.next(), true);
                }
            }
            return super.addAll(elements);
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public boolean add(View element) {
            Intrinsics.checkNotNullParameter(element, "element");
            Iterator it = p.this.d().iterator();
            while (it.hasNext()) {
                ((e) it.next()).a(element, true);
            }
            return super.add(element);
        }

        @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof View) {
                return e((View) obj);
            }
            return false;
        }

        public /* bridge */ boolean e(View view) {
            return super.contains(view);
        }

        public /* bridge */ int g() {
            return super.size();
        }

        public /* bridge */ int h(View view) {
            return super.indexOf(view);
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof View) {
                return h((View) obj);
            }
            return -1;
        }

        public /* bridge */ int j(View view) {
            return super.lastIndexOf(view);
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public final /* bridge */ View remove(int i10) {
            return o(i10);
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof View) {
                return j((View) obj);
            }
            return -1;
        }

        public /* bridge */ boolean n(View view) {
            return super.remove(view);
        }

        public View o(int i10) {
            Object objRemove = super.remove(i10);
            Intrinsics.checkNotNullExpressionValue(objRemove, "removeAt(...)");
            View view = (View) objRemove;
            Iterator it = p.this.d().iterator();
            while (it.hasNext()) {
                ((e) it.next()).a(view, false);
            }
            return view;
        }

        @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final /* bridge */ boolean remove(Object obj) {
            if (obj instanceof View) {
                return n((View) obj);
            }
            return false;
        }

        @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final /* bridge */ int size() {
            return g();
        }
    }

    public static final class c extends CopyOnWriteArrayList {
        c() {
        }

        @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public boolean add(e eVar) throws Exception {
            InterfaceC3698e0 interfaceC3698e0A = p.this.f45483b.a();
            try {
                for (View view : p.this.f45485d) {
                    if (eVar != null) {
                        eVar.a(view, true);
                    }
                }
                Unit unit = Unit.f48228a;
                Kd.a.a(interfaceC3698e0A, null);
                return super.add(eVar);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    Kd.a.a(interfaceC3698e0A, th);
                    throw th2;
                }
            }
        }

        @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj == null ? true : obj instanceof e) {
                return e((e) obj);
            }
            return false;
        }

        public /* bridge */ boolean e(e eVar) {
            return super.contains(eVar);
        }

        public /* bridge */ int g() {
            return super.size();
        }

        public /* bridge */ int h(e eVar) {
            return super.indexOf(eVar);
        }

        @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj == null ? true : obj instanceof e) {
                return h((e) obj);
            }
            return -1;
        }

        public /* bridge */ int j(e eVar) {
            return super.lastIndexOf(eVar);
        }

        public /* bridge */ boolean l(e eVar) {
            return super.remove(eVar);
        }

        @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj == null ? true : obj instanceof e) {
                return j((e) obj);
            }
            return -1;
        }

        @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
        public final /* bridge */ boolean remove(Object obj) {
            if (obj == null ? true : obj instanceof e) {
                return l((e) obj);
            }
            return false;
        }

        @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return g();
        }
    }

    private p() {
        this.f45482a = new AtomicBoolean(false);
        this.f45483b = new C3799a();
        this.f45484c = new c();
        this.f45485d = new b();
    }

    public /* synthetic */ p(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f45482a.set(true);
        this.f45484c.clear();
    }

    public final CopyOnWriteArrayList d() {
        return this.f45484c;
    }
}
