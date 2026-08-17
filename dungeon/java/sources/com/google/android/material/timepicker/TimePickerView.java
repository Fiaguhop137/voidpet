package com.google.android.material.timepicker;

import Y8.g;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;

/* JADX INFO: loaded from: classes2.dex */
class TimePickerView extends ConstraintLayout {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private final ClockFaceView f37217A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final MaterialButtonToggleGroup f37218B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final View.OnClickListener f37219C;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final Chip f37220x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final Chip f37221y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final ClockHandView f37222z;

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TimePickerView.u(TimePickerView.this);
        }
    }

    class b extends GestureDetector.SimpleOnGestureListener {
        b() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            TimePickerView.v(TimePickerView.this);
            return false;
        }
    }

    class c implements View.OnTouchListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ GestureDetector f37225a;

        c(GestureDetector gestureDetector) {
            this.f37225a = gestureDetector;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (((Checkable) view).isChecked()) {
                return this.f37225a.onTouchEvent(motionEvent);
            }
            return false;
        }
    }

    interface d {
    }

    interface e {
    }

    public TimePickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TimePickerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f37219C = new a();
        LayoutInflater.from(context).inflate(g.f17157j, this);
        this.f37217A = (ClockFaceView) findViewById(Y8.e.f17127i);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(Y8.e.f17130l);
        this.f37218B = materialButtonToggleGroup;
        materialButtonToggleGroup.b(new f(this));
        this.f37220x = (Chip) findViewById(Y8.e.f17133o);
        this.f37221y = (Chip) findViewById(Y8.e.f17131m);
        this.f37222z = (ClockHandView) findViewById(Y8.e.f17128j);
        x();
        w();
    }

    static /* synthetic */ e u(TimePickerView timePickerView) {
        timePickerView.getClass();
        return null;
    }

    static /* synthetic */ d v(TimePickerView timePickerView) {
        timePickerView.getClass();
        return null;
    }

    private void w() {
        this.f37220x.setTag(Y8.e.f17107L, 12);
        this.f37221y.setTag(Y8.e.f17107L, 10);
        this.f37220x.setOnClickListener(this.f37219C);
        this.f37221y.setOnClickListener(this.f37219C);
        this.f37220x.setAccessibilityClassName("android.view.View");
        this.f37221y.setAccessibilityClassName("android.view.View");
    }

    private void x() {
        c cVar = new c(new GestureDetector(getContext(), new b()));
        this.f37220x.setOnTouchListener(cVar);
        this.f37221y.setOnTouchListener(cVar);
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (view == this && i10 == 0) {
            this.f37221y.sendAccessibilityEvent(8);
        }
    }
}
