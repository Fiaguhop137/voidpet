package p062d7;

import android.os.Handler;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public class f {

    @NotNull
    private static final a Companion = new a(null);

    @Nullable
    private Runnable completionRunnable;
    private boolean shouldAnimateLayout;

    @NotNull
    private final p062d7.a layoutCreateAnimation = new i();

    @NotNull
    private final p062d7.a layoutUpdateAnimation = new l();

    @NotNull
    private final p062d7.a layoutDeleteAnimation = new j();

    @NotNull
    private final SparseArray<k> layoutHandlers = new SparseArray<>(0);
    private long maxAnimationDuration = -1;

    private static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final class b implements Animation.AnimationListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f39845b;

        b(int i10) {
            this.f39845b = i10;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            f.this.layoutHandlers.remove(this.f39845b);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            f.this.layoutHandlers.put(this.f39845b, (k) animation);
        }
    }

    public static final class c implements Animation.AnimationListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ g f39846a;

        c(g gVar) {
            this.f39846a = gVar;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation anim) {
            Intrinsics.checkNotNullParameter(anim, "anim");
            this.f39846a.a();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation anim) {
            Intrinsics.checkNotNullParameter(anim, "anim");
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation anim) {
            Intrinsics.checkNotNullParameter(anim, "anim");
        }
    }

    static {
        p348t6.b.a("LayoutAnimationController", p348t6.a.ERROR);
    }

    private final void b(View view) {
        view.setClickable(false);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
                b(childAt);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Callback callback) {
        callback.invoke(Boolean.TRUE);
    }

    private final void d(long j10) {
        if (this.completionRunnable != null) {
            Handler uiThreadHandler = UiThreadUtil.getUiThreadHandler();
            Runnable runnable = this.completionRunnable;
            Intrinsics.c(runnable);
            uiThreadHandler.removeCallbacks(runnable);
            Runnable runnable2 = this.completionRunnable;
            Intrinsics.c(runnable2);
            uiThreadHandler.postDelayed(runnable2, j10);
        }
    }

    public void applyLayoutUpdate(View view, int i10, int i11, int i12, int i13) {
        Intrinsics.checkNotNullParameter(view, "view");
        UiThreadUtil.assertOnUiThread();
        int id2 = view.getId();
        k kVar = this.layoutHandlers.get(id2);
        if (kVar != null) {
            if (kVar.isValid()) {
                kVar.b(i10, i11, i12, i13);
                return;
            }
            this.layoutHandlers.remove(id2);
        }
        Animation animationB = ((view.getWidth() == 0 || view.getHeight() == 0) ? this.layoutCreateAnimation : this.layoutUpdateAnimation).b(view, i10, i11, i12, i13);
        if (animationB instanceof k) {
            animationB.setAnimationListener(new b(id2));
        } else {
            view.layout(i10, i11, i10 + i12, i11 + i13);
        }
        if (animationB != null) {
            long duration = animationB.getDuration();
            if (duration > this.maxAnimationDuration) {
                this.maxAnimationDuration = duration;
                d(duration);
            }
            view.startAnimation(animationB);
        }
    }

    public void deleteView(View view, g listener) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(listener, "listener");
        UiThreadUtil.assertOnUiThread();
        Animation animationB = this.layoutDeleteAnimation.b(view, view.getLeft(), view.getTop(), view.getWidth(), view.getHeight());
        if (animationB == null) {
            listener.a();
            return;
        }
        b(view);
        animationB.setAnimationListener(new c(listener));
        long duration = animationB.getDuration();
        if (duration > this.maxAnimationDuration) {
            d(duration);
            this.maxAnimationDuration = duration;
        }
        view.startAnimation(animationB);
    }

    public final void initializeFromConfig(@Nullable ReadableMap readableMap, @Nullable Callback callback) {
        if (readableMap == null) {
            reset();
            return;
        }
        this.shouldAnimateLayout = false;
        int i10 = readableMap.hasKey("duration") ? readableMap.getInt("duration") : 0;
        h.a aVar = h.f39847a;
        h hVar = h.CREATE;
        if (readableMap.hasKey(aVar.a(hVar))) {
            p062d7.a aVar2 = this.layoutCreateAnimation;
            ReadableMap map = readableMap.getMap(aVar.a(hVar));
            Intrinsics.c(map);
            aVar2.f(map, i10);
            this.shouldAnimateLayout = true;
        }
        h hVar2 = h.UPDATE;
        if (readableMap.hasKey(aVar.a(hVar2))) {
            p062d7.a aVar3 = this.layoutUpdateAnimation;
            ReadableMap map2 = readableMap.getMap(aVar.a(hVar2));
            Intrinsics.c(map2);
            aVar3.f(map2, i10);
            this.shouldAnimateLayout = true;
        }
        h hVar3 = h.DELETE;
        if (readableMap.hasKey(aVar.a(hVar3))) {
            p062d7.a aVar4 = this.layoutDeleteAnimation;
            ReadableMap map3 = readableMap.getMap(aVar.a(hVar3));
            Intrinsics.c(map3);
            aVar4.f(map3, i10);
            this.shouldAnimateLayout = true;
        }
        if (!this.shouldAnimateLayout || callback == null) {
            return;
        }
        this.completionRunnable = new e(callback);
    }

    public void reset() {
        this.layoutCreateAnimation.h();
        this.layoutUpdateAnimation.h();
        this.layoutDeleteAnimation.h();
        this.completionRunnable = null;
        this.shouldAnimateLayout = false;
        this.maxAnimationDuration = -1L;
        int size = this.layoutHandlers.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            }
            k kVarValueAt = this.layoutHandlers.valueAt(size);
            Intrinsics.c(kVarValueAt);
            if (!kVarValueAt.isValid()) {
                this.layoutHandlers.removeAt(size);
            }
        }
    }

    public boolean shouldAnimateLayout(View view) {
        if (view == null) {
            return false;
        }
        return (this.shouldAnimateLayout && view.getParent() != null) || this.layoutHandlers.get(view.getId()) != null;
    }
}
