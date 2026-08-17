package W;

import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;

/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x f14439a = new x();

    private x() {
    }

    public final void A(ViewStructure viewStructure, int i10) {
        viewStructure.setVisibility(i10);
    }

    public final CharSequence B(AutofillValue autofillValue) {
        return autofillValue.getTextValue();
    }

    public final int a(ViewStructure viewStructure, int i10) {
        return viewStructure.addChildCount(i10);
    }

    public final AutofillValue b(String str) {
        return AutofillValue.forText(str);
    }

    public final boolean c(AutofillValue autofillValue) {
        return autofillValue.isDate();
    }

    public final boolean d(AutofillValue autofillValue) {
        return autofillValue.isList();
    }

    public final boolean e(AutofillValue autofillValue) {
        return autofillValue.isText();
    }

    public final boolean f(AutofillValue autofillValue) {
        return autofillValue.isToggle();
    }

    public final ViewStructure g(ViewStructure viewStructure, int i10) {
        return viewStructure.newChild(i10);
    }

    public final void h(ViewStructure viewStructure, String[] strArr) {
        viewStructure.setAutofillHints(strArr);
    }

    public final void i(ViewStructure viewStructure, AutofillId autofillId, int i10) {
        viewStructure.setAutofillId(autofillId, i10);
    }

    public final void j(ViewStructure viewStructure, int i10) {
        viewStructure.setAutofillType(i10);
    }

    public final void k(ViewStructure viewStructure, AutofillValue autofillValue) {
        viewStructure.setAutofillValue(autofillValue);
    }

    public final void l(ViewStructure viewStructure, boolean z10) {
        viewStructure.setCheckable(z10);
    }

    public final void m(ViewStructure viewStructure, boolean z10) {
        viewStructure.setChecked(z10);
    }

    public final void n(ViewStructure viewStructure, String str) {
        viewStructure.setClassName(str);
    }

    public final void o(ViewStructure viewStructure, boolean z10) {
        viewStructure.setClickable(z10);
    }

    public final void p(ViewStructure viewStructure, CharSequence charSequence) {
        viewStructure.setContentDescription(charSequence);
    }

    public final void q(ViewStructure viewStructure, boolean z10) {
        viewStructure.setDataIsSensitive(z10);
    }

    public final void r(ViewStructure viewStructure, int i10, int i11, int i12, int i13, int i14, int i15) {
        viewStructure.setDimens(i10, i11, i12, i13, i14, i15);
    }

    public final void s(ViewStructure viewStructure, boolean z10) {
        viewStructure.setEnabled(z10);
    }

    public final void t(ViewStructure viewStructure, boolean z10) {
        viewStructure.setFocusable(z10);
    }

    public final void u(ViewStructure viewStructure, boolean z10) {
        viewStructure.setFocused(z10);
    }

    public final void v(ViewStructure viewStructure, int i10, String str, String str2, String str3) {
        viewStructure.setId(i10, str, str2, str3);
    }

    public final void w(ViewStructure viewStructure, int i10) {
        viewStructure.setInputType(i10);
    }

    public final void x(ViewStructure viewStructure, boolean z10) {
        viewStructure.setLongClickable(z10);
    }

    public final void y(ViewStructure viewStructure, boolean z10) {
        viewStructure.setSelected(z10);
    }

    public final void z(ViewStructure viewStructure, CharSequence charSequence) {
        viewStructure.setText(charSequence);
    }
}
