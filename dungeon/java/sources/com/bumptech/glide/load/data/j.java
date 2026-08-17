package com.bumptech.glide.load.data;

import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class j implements d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final b f28665g = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p382v4.h f28666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f28667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f28668c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private HttpURLConnection f28669d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private InputStream f28670e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile boolean f28671f;

    private static class a implements b {
        a() {
        }

        @Override // com.bumptech.glide.load.data.j.b
        public HttpURLConnection a(URL url) {
            return (HttpURLConnection) url.openConnection();
        }
    }

    interface b {
        HttpURLConnection a(URL url);
    }

    public j(p382v4.h hVar, int i10) {
        this(hVar, i10, f28665g);
    }

    j(p382v4.h hVar, int i10, b bVar) {
        this.f28666a = hVar;
        this.f28667b = i10;
        this.f28668c = bVar;
    }

    private HttpURLConnection c(URL url, Map map) throws p274p4.e {
        try {
            HttpURLConnection httpURLConnectionA = this.f28668c.a(url);
            for (Map.Entry entry : map.entrySet()) {
                httpURLConnectionA.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            httpURLConnectionA.setConnectTimeout(this.f28667b);
            httpURLConnectionA.setReadTimeout(this.f28667b);
            httpURLConnectionA.setUseCaches(false);
            httpURLConnectionA.setDoInput(true);
            httpURLConnectionA.setInstanceFollowRedirects(false);
            return httpURLConnectionA;
        } catch (IOException e10) {
            throw new p274p4.e("URL.openConnection threw", 0, e10);
        }
    }

    private static int f(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException e10) {
            if (!Log.isLoggable("HttpUrlFetcher", 3)) {
                return -1;
            }
            Log.d("HttpUrlFetcher", "Failed to get a response code", e10);
            return -1;
        }
    }

    private InputStream g(HttpURLConnection httpURLConnection) throws p274p4.e {
        try {
            if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
                this.f28670e = L4.c.b(httpURLConnection.getInputStream(), httpURLConnection.getContentLength());
            } else {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection.getContentEncoding());
                }
                this.f28670e = httpURLConnection.getInputStream();
            }
            return this.f28670e;
        } catch (IOException e10) {
            throw new p274p4.e("Failed to obtain InputStream", f(httpURLConnection), e10);
        }
    }

    private static boolean h(int i10) {
        return i10 / 100 == 2;
    }

    private static boolean i(int i10) {
        return i10 / 100 == 3;
    }

    private InputStream j(URL url, int i10, URL url2, Map map) throws p274p4.e {
        if (i10 >= 5) {
            throw new p274p4.e("Too many (> 5) redirects!", -1);
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new p274p4.e("In re-direct loop", -1);
                }
            } catch (URISyntaxException unused) {
            }
        }
        HttpURLConnection httpURLConnectionC = c(url, map);
        this.f28669d = httpURLConnectionC;
        try {
            httpURLConnectionC.connect();
            this.f28670e = this.f28669d.getInputStream();
            if (this.f28671f) {
                return null;
            }
            int iF = f(this.f28669d);
            if (h(iF)) {
                return g(this.f28669d);
            }
            if (!i(iF)) {
                if (iF == -1) {
                    throw new p274p4.e(iF);
                }
                try {
                    throw new p274p4.e(this.f28669d.getResponseMessage(), iF);
                } catch (IOException e10) {
                    throw new p274p4.e("Failed to get a response message", iF, e10);
                }
            }
            String headerField = this.f28669d.getHeaderField("Location");
            if (TextUtils.isEmpty(headerField)) {
                throw new p274p4.e("Received empty or null redirect url", iF);
            }
            try {
                URL url3 = new URL(url, headerField);
                b();
                return j(url3, i10 + 1, url, map);
            } catch (MalformedURLException e11) {
                throw new p274p4.e("Bad redirect url: " + headerField, iF, e11);
            }
        } catch (IOException e12) {
            throw new p274p4.e("Failed to connect or obtain data", f(this.f28669d), e12);
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public Class a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() {
        InputStream inputStream = this.f28670e;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f28669d;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f28669d = null;
    }

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
        this.f28671f = true;
    }

    @Override // com.bumptech.glide.load.data.d
    public p274p4.a d() {
        return p274p4.a.REMOTE;
    }

    @Override // com.bumptech.glide.load.data.d
    public void e(com.bumptech.glide.h hVar, d.a aVar) {
        long jB = L4.g.b();
        try {
            aVar.f(j(this.f28666a.i(), 0, null, this.f28666a.e()));
        } catch (IOException e10) {
            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                Log.d("HttpUrlFetcher", "Failed to load data for url", e10);
            }
            aVar.c(e10);
        } finally {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + L4.g.a(jB));
            }
        }
    }
}
