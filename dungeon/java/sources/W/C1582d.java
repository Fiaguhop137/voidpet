package W;

import android.view.View;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;

/* JADX INFO: renamed from: W.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1582d implements InterfaceC1589k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f14422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final H f14423b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AutofillManager f14424c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private AutofillId f14425d;

    public C1582d(View view, H h10) {
        this.f14422a = view;
        this.f14423b = h10;
        AutofillManager autofillManagerA = AbstractC1580b.a(view.getContext().getSystemService(AbstractC1579a.a()));
        if (autofillManagerA == null) {
            throw new IllegalStateException("Autofill service could not be located.");
        }
        this.f14424c = autofillManagerA;
        view.setImportantForAutofill(1);
        p378v0.b bVarA = p378v0.e.a(view);
        AutofillId autofillIdA = bVarA != null ? bVarA.a() : null;
        if (autofillIdA != null) {
            this.f14425d = autofillIdA;
        } else {
            p270p0.a.c("Required value was null.");
            throw new Ad.g();
        }
    }

    public final AutofillManager a() {
        return this.f14424c;
    }

    public final H b() {
        return this.f14423b;
    }

    public final AutofillId c() {
        return this.f14425d;
    }

    public final View d() {
        return this.f14422a;
    }
}
