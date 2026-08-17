package R;

import I.InterfaceC1076t1;
import java.util.Arrays;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
final class d implements m, InterfaceC1076t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private i f9849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private e f9850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f9851c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Object f9852d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Object[] f9853e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private e.a f9854f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Function0 f9855g = new c(this);

    public d(i iVar, e eVar, String str, Object obj, Object[] objArr) {
        this.f9849a = iVar;
        this.f9850b = eVar;
        this.f9851c = str;
        this.f9852d = obj;
        this.f9853e = objArr;
    }

    private final void c() {
        e eVar = this.f9850b;
        if (this.f9854f == null) {
            if (eVar != null) {
                b.f(eVar, this.f9855g.invoke());
                this.f9854f = eVar.a(this.f9851c, this.f9855g);
                return;
            }
            return;
        }
        throw new IllegalArgumentException(("entry(" + this.f9854f + ") is not null").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object e(d dVar) {
        i iVar = dVar.f9849a;
        Object obj = dVar.f9852d;
        if (obj != null) {
            return iVar.b(dVar, obj);
        }
        throw new IllegalArgumentException("Value should be initialized");
    }

    public final Object b(Object[] objArr) {
        if (Arrays.equals(objArr, this.f9853e)) {
            return this.f9852d;
        }
        return null;
    }

    public final void d(i iVar, e eVar, String str, Object obj, Object[] objArr) {
        boolean z10;
        boolean z11 = true;
        if (this.f9850b != eVar) {
            this.f9850b = eVar;
            z10 = true;
        } else {
            z10 = false;
        }
        if (Intrinsics.b(this.f9851c, str)) {
            z11 = z10;
        } else {
            this.f9851c = str;
        }
        this.f9849a = iVar;
        this.f9852d = obj;
        this.f9853e = objArr;
        e.a aVar = this.f9854f;
        if (aVar == null || !z11) {
            return;
        }
        if (aVar != null) {
            aVar.a();
        }
        this.f9854f = null;
        c();
    }

    @Override // I.InterfaceC1076t1
    public void g() {
        c();
    }

    @Override // I.InterfaceC1076t1
    public void j() {
        e.a aVar = this.f9854f;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // I.InterfaceC1076t1
    public void l() {
        e.a aVar = this.f9854f;
        if (aVar != null) {
            aVar.a();
        }
    }
}
