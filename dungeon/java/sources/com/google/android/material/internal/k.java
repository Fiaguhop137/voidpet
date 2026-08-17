package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.transition.AbstractC2013k;
import androidx.transition.v;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class k extends AbstractC2013k {

    class a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ TextView f36782a;

        a(TextView textView) {
            this.f36782a = textView;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.f36782a.setScaleX(fFloatValue);
            this.f36782a.setScaleY(fFloatValue);
        }
    }

    private void n0(v vVar) {
        View view = vVar.f25665b;
        if (view instanceof TextView) {
            vVar.f25664a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // androidx.transition.AbstractC2013k
    public void g(v vVar) {
        n0(vVar);
    }

    @Override // androidx.transition.AbstractC2013k
    public void l(v vVar) {
        n0(vVar);
    }

    @Override // androidx.transition.AbstractC2013k
    public Animator p(ViewGroup viewGroup, v vVar, v vVar2) {
        if (vVar == null || vVar2 == null || !(vVar.f25665b instanceof TextView)) {
            return null;
        }
        View view = vVar2.f25665b;
        if (!(view instanceof TextView)) {
            return null;
        }
        TextView textView = (TextView) view;
        Map map = vVar.f25664a;
        Map map2 = vVar2.f25664a;
        float fFloatValue = map.get("android:textscale:scale") != null ? ((Float) map.get("android:textscale:scale")).floatValue() : 1.0f;
        float fFloatValue2 = map2.get("android:textscale:scale") != null ? ((Float) map2.get("android:textscale:scale")).floatValue() : 1.0f;
        if (fFloatValue == fFloatValue2) {
            return null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fFloatValue, fFloatValue2);
        valueAnimatorOfFloat.addUpdateListener(new a(textView));
        return valueAnimatorOfFloat;
    }
}
