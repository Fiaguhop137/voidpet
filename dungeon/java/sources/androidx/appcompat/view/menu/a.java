package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Context f20265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected Context f20266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected e f20267c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected LayoutInflater f20268d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected LayoutInflater f20269e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private j.a f20270f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f20271g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f20272h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected k f20273i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f20274j;

    public a(Context context, int i10, int i11) {
        this.f20265a = context;
        this.f20268d = LayoutInflater.from(context);
        this.f20271g = i10;
        this.f20272h = i11;
    }

    protected void a(View view, int i10) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f20273i).addView(view, i10);
    }

    @Override // androidx.appcompat.view.menu.j
    public void b(e eVar, boolean z10) {
        j.a aVar = this.f20270f;
        if (aVar != null) {
            aVar.b(eVar, z10);
        }
    }

    public abstract void c(g gVar, k.a aVar);

    @Override // androidx.appcompat.view.menu.j
    public boolean d(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void e(j.a aVar) {
        this.f20270f = aVar;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.appcompat.view.menu.j
    public boolean g(m mVar) {
        j.a aVar = this.f20270f;
        e eVar = mVar;
        if (aVar == null) {
            return false;
        }
        if (mVar == null) {
            eVar = this.f20267c;
        }
        return aVar.c(eVar);
    }

    @Override // androidx.appcompat.view.menu.j
    public int getId() {
        return this.f20274j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.j
    public void i(boolean z10) {
        ViewGroup viewGroup = (ViewGroup) this.f20273i;
        if (viewGroup == null) {
            return;
        }
        e eVar = this.f20267c;
        int i10 = 0;
        if (eVar != null) {
            eVar.t();
            ArrayList arrayListG = this.f20267c.G();
            int size = arrayListG.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                g gVar = (g) arrayListG.get(i12);
                if (s(i11, gVar)) {
                    View childAt = viewGroup.getChildAt(i11);
                    g itemData = childAt instanceof k.a ? ((k.a) childAt).getItemData() : null;
                    View viewP = p(gVar, childAt, viewGroup);
                    if (gVar != itemData) {
                        viewP.setPressed(false);
                        viewP.jumpDrawablesToCurrentState();
                    }
                    if (viewP != childAt) {
                        a(viewP, i11);
                    }
                    i11++;
                }
            }
            i10 = i11;
        }
        while (i10 < viewGroup.getChildCount()) {
            if (!n(viewGroup, i10)) {
                i10++;
            }
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean k(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void l(Context context, e eVar) {
        this.f20266b = context;
        this.f20269e = LayoutInflater.from(context);
        this.f20267c = eVar;
    }

    public k.a m(ViewGroup viewGroup) {
        return (k.a) this.f20268d.inflate(this.f20272h, viewGroup, false);
    }

    protected boolean n(ViewGroup viewGroup, int i10) {
        viewGroup.removeViewAt(i10);
        return true;
    }

    public j.a o() {
        return this.f20270f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View p(g gVar, View view, ViewGroup viewGroup) {
        k.a aVarM = view instanceof k.a ? (k.a) view : m(viewGroup);
        c(gVar, aVarM);
        return (View) aVarM;
    }

    public k q(ViewGroup viewGroup) {
        if (this.f20273i == null) {
            k kVar = (k) this.f20268d.inflate(this.f20271g, viewGroup, false);
            this.f20273i = kVar;
            kVar.a(this.f20267c);
            i(true);
        }
        return this.f20273i;
    }

    public void r(int i10) {
        this.f20274j = i10;
    }

    public abstract boolean s(int i10, g gVar);
}
