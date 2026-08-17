package androidx.core.app;

import android.app.Activity;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import android.view.FrameMetrics;
import android.view.Window;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class FrameMetricsAggregator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f23077a;

    private static class a extends b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static HandlerThread f23078e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static Handler f23079f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f23080a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        SparseIntArray[] f23081b = new SparseIntArray[9];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ArrayList f23082c = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Window.OnFrameMetricsAvailableListener f23083d = new WindowOnFrameMetricsAvailableListenerC0278a();

        /* JADX INFO: renamed from: androidx.core.app.FrameMetricsAggregator$a$a, reason: collision with other inner class name */
        class WindowOnFrameMetricsAvailableListenerC0278a implements Window.OnFrameMetricsAvailableListener {
            WindowOnFrameMetricsAvailableListenerC0278a() {
            }

            @Override // android.view.Window.OnFrameMetricsAvailableListener
            public void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i10) {
                a aVar = a.this;
                if ((aVar.f23080a & 1) != 0) {
                    aVar.f(aVar.f23081b[0], frameMetrics.getMetric(8));
                }
                a aVar2 = a.this;
                if ((aVar2.f23080a & 2) != 0) {
                    aVar2.f(aVar2.f23081b[1], frameMetrics.getMetric(1));
                }
                a aVar3 = a.this;
                if ((aVar3.f23080a & 4) != 0) {
                    aVar3.f(aVar3.f23081b[2], frameMetrics.getMetric(3));
                }
                a aVar4 = a.this;
                if ((aVar4.f23080a & 8) != 0) {
                    aVar4.f(aVar4.f23081b[3], frameMetrics.getMetric(4));
                }
                a aVar5 = a.this;
                if ((aVar5.f23080a & 16) != 0) {
                    aVar5.f(aVar5.f23081b[4], frameMetrics.getMetric(5));
                }
                a aVar6 = a.this;
                if ((aVar6.f23080a & 64) != 0) {
                    aVar6.f(aVar6.f23081b[6], frameMetrics.getMetric(7));
                }
                a aVar7 = a.this;
                if ((aVar7.f23080a & 32) != 0) {
                    aVar7.f(aVar7.f23081b[5], frameMetrics.getMetric(6));
                }
                a aVar8 = a.this;
                if ((aVar8.f23080a & 128) != 0) {
                    aVar8.f(aVar8.f23081b[7], frameMetrics.getMetric(0));
                }
                a aVar9 = a.this;
                if ((aVar9.f23080a & 256) != 0) {
                    aVar9.f(aVar9.f23081b[8], frameMetrics.getMetric(2));
                }
            }
        }

        a(int i10) {
            this.f23080a = i10;
        }

        @Override // androidx.core.app.FrameMetricsAggregator.b
        public void a(Activity activity) {
            if (f23078e == null) {
                HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
                f23078e = handlerThread;
                handlerThread.start();
                f23079f = new Handler(f23078e.getLooper());
            }
            for (int i10 = 0; i10 <= 8; i10++) {
                SparseIntArray[] sparseIntArrayArr = this.f23081b;
                if (sparseIntArrayArr[i10] == null && (this.f23080a & (1 << i10)) != 0) {
                    sparseIntArrayArr[i10] = new SparseIntArray();
                }
            }
            activity.getWindow().addOnFrameMetricsAvailableListener(this.f23083d, f23079f);
            this.f23082c.add(new WeakReference(activity));
        }

        @Override // androidx.core.app.FrameMetricsAggregator.b
        public SparseIntArray[] b() {
            return this.f23081b;
        }

        @Override // androidx.core.app.FrameMetricsAggregator.b
        public SparseIntArray[] c(Activity activity) {
            for (WeakReference weakReference : this.f23082c) {
                if (weakReference.get() == activity) {
                    this.f23082c.remove(weakReference);
                    break;
                }
            }
            activity.getWindow().removeOnFrameMetricsAvailableListener(this.f23083d);
            return this.f23081b;
        }

        @Override // androidx.core.app.FrameMetricsAggregator.b
        public SparseIntArray[] d() {
            SparseIntArray[] sparseIntArrayArr = this.f23081b;
            this.f23081b = new SparseIntArray[9];
            return sparseIntArrayArr;
        }

        @Override // androidx.core.app.FrameMetricsAggregator.b
        public SparseIntArray[] e() {
            for (int size = this.f23082c.size() - 1; size >= 0; size--) {
                WeakReference weakReference = (WeakReference) this.f23082c.get(size);
                Activity activity = (Activity) weakReference.get();
                if (weakReference.get() != null) {
                    activity.getWindow().removeOnFrameMetricsAvailableListener(this.f23083d);
                    this.f23082c.remove(size);
                }
            }
            return this.f23081b;
        }

        void f(SparseIntArray sparseIntArray, long j10) {
            if (sparseIntArray != null) {
                int i10 = (int) ((500000 + j10) / 1000000);
                if (j10 >= 0) {
                    sparseIntArray.put(i10, sparseIntArray.get(i10) + 1);
                }
            }
        }
    }

    private static class b {
        b() {
        }

        public abstract void a(Activity activity);

        public abstract SparseIntArray[] b();

        public abstract SparseIntArray[] c(Activity activity);

        public abstract SparseIntArray[] d();

        public abstract SparseIntArray[] e();
    }

    public FrameMetricsAggregator() {
        this(1);
    }

    public FrameMetricsAggregator(int i10) {
        this.f23077a = new a(i10);
    }

    public void a(Activity activity) {
        this.f23077a.a(activity);
    }

    public SparseIntArray[] b() {
        return this.f23077a.b();
    }

    public SparseIntArray[] c(Activity activity) {
        return this.f23077a.c(activity);
    }

    public SparseIntArray[] d() {
        return this.f23077a.d();
    }

    public SparseIntArray[] e() {
        return this.f23077a.e();
    }
}
