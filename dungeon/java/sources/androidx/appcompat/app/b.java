package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;

/* JADX INFO: loaded from: classes.dex */
public class b extends r implements DialogInterface {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final AlertController f19988f;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AlertController.b f19989a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f19990b;

        public a(Context context) {
            this(context, b.l(context, 0));
        }

        public a(Context context, int i10) {
            this.f19989a = new AlertController.b(new ContextThemeWrapper(context, b.l(context, i10)));
            this.f19990b = i10;
        }

        public b a() {
            b bVar = new b(this.f19989a.f19948a, this.f19990b);
            this.f19989a.a(bVar.f19988f);
            bVar.setCancelable(this.f19989a.f19965r);
            if (this.f19989a.f19965r) {
                bVar.setCanceledOnTouchOutside(true);
            }
            bVar.setOnCancelListener(this.f19989a.f19966s);
            bVar.setOnDismissListener(this.f19989a.f19967t);
            DialogInterface.OnKeyListener onKeyListener = this.f19989a.f19968u;
            if (onKeyListener != null) {
                bVar.setOnKeyListener(onKeyListener);
            }
            return bVar;
        }

        public Context b() {
            return this.f19989a.f19948a;
        }

        public a c(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f19989a;
            bVar.f19970w = listAdapter;
            bVar.f19971x = onClickListener;
            return this;
        }

        public a d(View view) {
            this.f19989a.f19954g = view;
            return this;
        }

        public a e(Drawable drawable) {
            this.f19989a.f19951d = drawable;
            return this;
        }

        public a f(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f19989a;
            bVar.f19969v = charSequenceArr;
            bVar.f19971x = onClickListener;
            return this;
        }

        public a g(CharSequence charSequence) {
            this.f19989a.f19955h = charSequence;
            return this;
        }

        public a h(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f19989a;
            bVar.f19959l = charSequence;
            bVar.f19961n = onClickListener;
            return this;
        }

        public a i(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f19989a;
            bVar.f19962o = charSequence;
            bVar.f19964q = onClickListener;
            return this;
        }

        public a j(DialogInterface.OnKeyListener onKeyListener) {
            this.f19989a.f19968u = onKeyListener;
            return this;
        }

        public a k(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f19989a;
            bVar.f19956i = charSequence;
            bVar.f19958k = onClickListener;
            return this;
        }

        public a l(ListAdapter listAdapter, int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f19989a;
            bVar.f19970w = listAdapter;
            bVar.f19971x = onClickListener;
            bVar.f19941I = i10;
            bVar.f19940H = true;
            return this;
        }

        public a m(CharSequence charSequence) {
            this.f19989a.f19953f = charSequence;
            return this;
        }

        public a n(View view) {
            AlertController.b bVar = this.f19989a;
            bVar.f19973z = view;
            bVar.f19972y = 0;
            bVar.f19937E = false;
            return this;
        }
    }

    protected b(Context context, int i10) {
        super(context, l(context, i10));
        this.f19988f = new AlertController(getContext(), this, getWindow());
    }

    static int l(Context context, int i10) {
        if (((i10 >>> 24) & 255) >= 1) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(p144i.a.f43084l, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView k() {
        return this.f19988f.d();
    }

    @Override // androidx.appcompat.app.r, p054d.r, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f19988f.e();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (this.f19988f.f(i10, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (this.f19988f.g(i10, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i10, keyEvent);
    }

    @Override // androidx.appcompat.app.r, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f19988f.p(charSequence);
    }
}
