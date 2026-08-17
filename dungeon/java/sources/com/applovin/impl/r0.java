package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.applovin.sdk.Axon;
import com.applovin.sdk.R;
import com.applovin.ui.AxonDebuggerActivity;
import java.lang.ref.WeakReference;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class r0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static WeakReference f28306f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final AtomicBoolean f28307g = new AtomicBoolean();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final AtomicBoolean f28308h = new AtomicBoolean();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f28309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f28310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public WeakReference f28311c = new WeakReference(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p0 f28312d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f28313e;

    public r0(p pVar) {
        this.f28309a = pVar;
        Context context = p.f28247J;
        this.f28310b = context;
        p0 p0Var = new p0(context);
        this.f28312d = p0Var;
        p0Var.a(pVar);
    }

    public final View a(Activity activity) {
        View view;
        Random random = i1.f28067a;
        int iApplyDimension = (int) TypedValue.applyDimension(1, 40, activity.getResources().getDisplayMetrics());
        int i10 = iApplyDimension / 10;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iApplyDimension, iApplyDimension, 8388629);
        layoutParams.setMargins(i10, i10, i10, i10);
        try {
            ImageButton imageButton = new ImageButton(activity);
            imageButton.setImageDrawable(activity.getResources().getDrawable(R.drawable.axon_ic_white));
            imageButton.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageButton.setPadding(i10, i10, i10, i10 * 2);
            view = imageButton;
        } catch (Throwable unused) {
            Button button = new Button(activity);
            button.setText("ⓘ");
            button.setTextColor(-1);
            button.setAllCaps(false);
            button.setTextSize(2, 20.0f);
            button.setPadding(0, 0, 0, 0);
            view = button;
        }
        view.setLayoutParams(layoutParams);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(Color.rgb(5, 131, 170));
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(1);
        gradientDrawable2.setColor(Color.rgb(2, 98, 127));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842919}, gradientDrawable2);
        stateListDrawable.addState(new int[0], gradientDrawable);
        view.setBackground(stateListDrawable);
        view.setOnClickListener(new p184k4.q0(this));
        view.setElevation((int) TypedValue.applyDimension(1, 5, activity.getResources().getDisplayMetrics()));
        return view;
    }

    public final void a() {
        if (b() && this.f28311c.get() == null) {
            WeakReference weakReference = f28306f;
            if (weakReference == null || weakReference.get() == null) {
                this.f28309a.getClass();
                Activity activity = (Activity) p.a(p.f28247J).f27936b.get();
                if (activity == null) {
                    this.f28309a.g();
                    if (p1.f28289b) {
                        this.f28309a.g().a(p1.f28288a, "Failed to display Debugger button", null);
                        return;
                    }
                    return;
                }
                if (!this.f28313e) {
                    this.f28309a.getClass();
                    b bVarA = p.a(p.f28247J);
                    bVarA.f27935a.add(new q0(this));
                    this.f28313e = true;
                }
                View viewFindViewById = activity.findViewById(16908290);
                if (viewFindViewById instanceof FrameLayout) {
                    FrameLayout frameLayout = (FrameLayout) viewFindViewById;
                    View viewA = a(activity);
                    frameLayout.addView(viewA);
                    AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                    alphaAnimation.setDuration(150L);
                    viewA.startAnimation(alphaAnimation);
                    viewFindViewById.getViewTreeObserver().addOnGlobalLayoutListener(new p184k4.p0(this, viewA, frameLayout));
                    this.f28311c = new WeakReference(viewA);
                }
            }
        }
    }

    public final void a(View view) {
        WeakReference weakReference = f28306f;
        if ((weakReference != null && weakReference.get() != null) || !f28307g.compareAndSet(false, true)) {
            p1.c("DebuggerService", "Debugger is already showing", null);
            return;
        }
        Intent intent = new Intent(this.f28310b, (Class<?>) AxonDebuggerActivity.class);
        intent.setFlags(268435456);
        p1.c("DebuggerService", "Starting Debugger...");
        this.f28310b.startActivity(intent);
        if (f28308h.compareAndSet(false, true)) {
            p0 p0Var = this.f28312d;
            p0Var.getClass();
            StringBuilder sb2 = new StringBuilder("\n========== DEBUGGER ==========\n========== APP INFO ==========");
            sb2.append("\nDev Build - " + i1.a(p.f28247J));
            sb2.append("\nTest Mode - ".concat((p0Var.f28284e.c().f28087h || t0.a()) ? "enabled" : "disabled"));
            sb2.append("\nTarget SDK - " + p0Var.f28284e.c().e().get("target_sdk"));
            sb2.append("\nSDK Version - " + Axon.VERSION);
            sb2.append("\n========== END ==========");
            p1.c("DebuggerListAdapter", sb2.toString());
            p0Var.f28285f.append(sb2.toString());
        }
    }

    public final /* synthetic */ void a(View view, FrameLayout frameLayout) {
        if (view.getParent() != null || this.f28311c.get() == null) {
            return;
        }
        frameLayout.addView(view);
    }

    public final boolean b() {
        return ((Boolean) this.f28309a.l().a(m2.f28184f1)).booleanValue() && this.f28309a.f28255E;
    }

    public final void c() {
        if (b()) {
            i3.a(false, new p184k4.r0(this));
        }
    }

    public final String toString() {
        return "DebuggerService{, listAdapter=" + this.f28312d + "}";
    }
}
