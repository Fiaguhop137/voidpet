package p136h9;

import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes2.dex */
public class a implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Dialog f42668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f42669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f42670c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f42671d;

    public a(Dialog dialog, Rect rect) {
        this.f42668a = dialog;
        this.f42669b = rect.left;
        this.f42670c = rect.top;
        this.f42671d = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        View viewFindViewById = view.findViewById(16908290);
        int left = this.f42669b + viewFindViewById.getLeft();
        int width = viewFindViewById.getWidth() + left;
        int top = this.f42670c + viewFindViewById.getTop();
        if (new RectF(left, top, width, viewFindViewById.getHeight() + top).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            motionEventObtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            motionEventObtain.setAction(0);
            int i10 = this.f42671d;
            motionEventObtain.setLocation((-i10) - 1, (-i10) - 1);
        }
        view.performClick();
        return this.f42668a.onTouchEvent(motionEventObtain);
    }
}
