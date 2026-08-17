package com.google.firebase.messaging;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes2.dex */
public class G implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final URL f37485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Future f37486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Task f37487c;

    private G(URL url) {
        this.f37485a = url;
    }

    public static /* synthetic */ void a(G g10, TaskCompletionSource taskCompletionSource) {
        g10.getClass();
        try {
            taskCompletionSource.setResult(g10.b());
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    private byte[] c() throws IOException {
        URLConnection uRLConnectionOpenConnection = this.f37485a.openConnection();
        if (uRLConnectionOpenConnection.getContentLength() > 1048576) {
            throw new IOException("Content-Length exceeds max size of 1048576");
        }
        InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
        try {
            byte[] bArrD = AbstractC3107b.d(AbstractC3107b.b(inputStream, 1048577L));
            if (inputStream != null) {
                inputStream.close();
            }
            if (Log.isLoggable("FirebaseMessaging", 2)) {
                Log.v("FirebaseMessaging", "Downloaded " + bArrD.length + " bytes from " + this.f37485a);
            }
            if (bArrD.length <= 1048576) {
                return bArrD;
            }
            throw new IOException("Image exceeds max size of 1048576");
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static G d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new G(new URL(str));
        } catch (MalformedURLException unused) {
            Log.w("FirebaseMessaging", "Not downloading image, bad URL: " + str);
            return null;
        }
    }

    public Bitmap b() throws IOException {
        if (Log.isLoggable("FirebaseMessaging", 4)) {
            Log.i("FirebaseMessaging", "Starting download of: " + this.f37485a);
        }
        byte[] bArrC = c();
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrC, 0, bArrC.length);
        if (bitmapDecodeByteArray == null) {
            throw new IOException("Failed to decode image: " + this.f37485a);
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Successfully downloaded image: " + this.f37485a);
        }
        return bitmapDecodeByteArray;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f37486b.cancel(true);
    }

    public Task e() {
        return (Task) p170j8.r.l(this.f37487c);
    }

    public void f(ExecutorService executorService) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f37486b = executorService.submit(new F(this, taskCompletionSource));
        this.f37487c = taskCompletionSource.getTask();
    }
}
