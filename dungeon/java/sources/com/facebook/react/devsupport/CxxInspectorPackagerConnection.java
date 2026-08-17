package com.facebook.react.devsupport;

import android.os.Handler;
import android.os.Looper;
import com.facebook.jni.HybridData;
import com.facebook.soloader.SoLoader;
import java.io.Closeable;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0004\u0013\u0014\u0015\u0012B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096 ¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\bH\u0096 ¢\u0006\u0004\b\u000b\u0010\nJ\u001a\u0010\r\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0096 ¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection;", "Lcom/facebook/react/devsupport/W;", "", "url", "deviceName", "packageName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "connect", "()V", "closeQuietly", "event", "sendEventToAllConnections", "(Ljava/lang/String;)V", "Lcom/facebook/jni/HybridData;", "mHybridData", "Lcom/facebook/jni/HybridData;", "a", "WebSocketDelegate", "IWebSocket", "DelegateImpl", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CxxInspectorPackagerConnection implements W {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @p276p6.a
    @NotNull
    private final HybridData mHybridData;

    /* JADX INFO: Access modifiers changed from: private */
    static final class DelegateImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final p339sf.A f29570a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Handler f29571b;

        public static final class a implements IWebSocket {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ p339sf.I f29572a;

            a(p339sf.I i10) {
                this.f29572a = i10;
            }

            @Override // com.facebook.react.devsupport.CxxInspectorPackagerConnection.IWebSocket, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                this.f29572a.e(1000, "End of session");
            }

            @Override // com.facebook.react.devsupport.CxxInspectorPackagerConnection.IWebSocket
            public void send(String message) {
                Intrinsics.checkNotNullParameter(message, "message");
                this.f29572a.send(message);
            }
        }

        public static final class b extends p339sf.J {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ WebSocketDelegate f29574b;

            b(WebSocketDelegate webSocketDelegate) {
                this.f29574b = webSocketDelegate;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void k(WebSocketDelegate webSocketDelegate) {
                webSocketDelegate.didClose();
                webSocketDelegate.close();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void l(Throwable th, WebSocketDelegate webSocketDelegate) {
                String message = th.getMessage();
                if (message == null) {
                    message = "<Unknown error>";
                }
                webSocketDelegate.didFailWithError(null, message);
                webSocketDelegate.close();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void m(WebSocketDelegate webSocketDelegate, String str) {
                webSocketDelegate.didReceiveMessage(str);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void n(WebSocketDelegate webSocketDelegate) {
                webSocketDelegate.didOpen();
            }

            @Override // p339sf.J
            public void a(p339sf.I webSocket, int i10, String reason) {
                Intrinsics.checkNotNullParameter(webSocket, "webSocket");
                Intrinsics.checkNotNullParameter(reason, "reason");
                DelegateImpl.this.scheduleCallback(new RunnableC2208i(this.f29574b), 0L);
            }

            @Override // p339sf.J
            public void c(p339sf.I webSocket, Throwable t10, p339sf.E e10) {
                Intrinsics.checkNotNullParameter(webSocket, "webSocket");
                Intrinsics.checkNotNullParameter(t10, "t");
                DelegateImpl.this.scheduleCallback(new RunnableC2207h(t10, this.f29574b), 0L);
            }

            @Override // p339sf.J
            public void e(p339sf.I webSocket, String text) {
                Intrinsics.checkNotNullParameter(webSocket, "webSocket");
                Intrinsics.checkNotNullParameter(text, "text");
                DelegateImpl.this.scheduleCallback(new RunnableC2210k(this.f29574b, text), 0L);
            }

            @Override // p339sf.J
            public void f(p339sf.I webSocket, p339sf.E response) {
                Intrinsics.checkNotNullParameter(webSocket, "webSocket");
                Intrinsics.checkNotNullParameter(response, "response");
                DelegateImpl.this.scheduleCallback(new RunnableC2209j(this.f29574b), 0L);
            }
        }

        public DelegateImpl() {
            sf.A.a aVar = new sf.A.a();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            this.f29570a = aVar.f(10L, timeUnit).Q(10L, timeUnit).P(0L, TimeUnit.MINUTES).c();
            this.f29571b = new Handler(Looper.getMainLooper());
        }

        @p276p6.a
        @NotNull
        public final IWebSocket connectWebSocket(@Nullable String str, @NotNull WebSocketDelegate delegate) {
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            if (str == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            return new a(this.f29570a.F(new sf.C.a().l(str).b(), new b(delegate)));
        }

        @p276p6.a
        public final void scheduleCallback(@NotNull Runnable runnable, long j10) {
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            this.f29571b.postDelayed(runnable, j10);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bc\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$IWebSocket;", "Ljava/io/Closeable;", "send", "", "message", "", "close", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private interface IWebSocket extends Closeable {
        @Override // java.io.Closeable, java.lang.AutoCloseable
        void close();

        void send(@NotNull String message);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @p276p6.a
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0086 ¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\bH\u0086 ¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\nH\u0086 ¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\nH\u0086 ¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$WebSocketDelegate;", "Ljava/io/Closeable;", "Lcom/facebook/jni/HybridData;", "mHybridData", "<init>", "(Lcom/facebook/jni/HybridData;)V", "", "posixCode", "", "error", "", "didFailWithError", "(Ljava/lang/Integer;Ljava/lang/String;)V", "message", "didReceiveMessage", "(Ljava/lang/String;)V", "didOpen", "()V", "didClose", "close", "a", "Lcom/facebook/jni/HybridData;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class WebSocketDelegate implements Closeable {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final HybridData mHybridData;

        @p276p6.a
        public WebSocketDelegate(@NotNull HybridData mHybridData) {
            Intrinsics.checkNotNullParameter(mHybridData, "mHybridData");
            this.mHybridData = mHybridData;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.mHybridData.resetNative();
        }

        public final native void didClose();

        public final native void didFailWithError(@Nullable Integer posixCode, @Nullable String error);

        public final native void didOpen();

        public final native void didReceiveMessage(@Nullable String message);
    }

    /* JADX INFO: renamed from: com.facebook.react.devsupport.CxxInspectorPackagerConnection$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final HybridData b(String str, String str2, String str3, DelegateImpl delegateImpl) {
            return CxxInspectorPackagerConnection.initHybrid(str, str2, str3, delegateImpl);
        }
    }

    static {
        SoLoader.t("react_devsupportjni");
    }

    public CxxInspectorPackagerConnection(String url, String deviceName, String packageName) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(deviceName, "deviceName");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        this.mHybridData = INSTANCE.b(url, deviceName, packageName, new DelegateImpl());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final native HybridData initHybrid(String str, String str2, String str3, DelegateImpl delegateImpl);

    @Override // com.facebook.react.devsupport.W
    public native void closeQuietly();

    public native void connect();

    @Override // com.facebook.react.devsupport.W
    public native void sendEventToAllConnections(@Nullable String event);
}
