package androidx.appcompat.widget;

import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
class b0 extends p289q1.c implements View.OnClickListener {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final SearchView f20873l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final SearchableInfo f20874m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f20875n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final WeakHashMap f20876o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final int f20877p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f20878q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f20879r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private ColorStateList f20880s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f20881t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f20882u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f20883v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f20884w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f20885x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f20886y;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f20887a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f20888b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ImageView f20889c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ImageView f20890d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ImageView f20891e;

        public a(View view) {
            this.f20887a = (TextView) view.findViewById(16908308);
            this.f20888b = (TextView) view.findViewById(16908309);
            this.f20889c = (ImageView) view.findViewById(16908295);
            this.f20890d = (ImageView) view.findViewById(16908296);
            this.f20891e = (ImageView) view.findViewById(p144i.f.f43200r);
        }
    }

    public b0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), null, true);
        this.f20878q = false;
        this.f20879r = 1;
        this.f20881t = -1;
        this.f20882u = -1;
        this.f20883v = -1;
        this.f20884w = -1;
        this.f20885x = -1;
        this.f20886y = -1;
        this.f20873l = searchView;
        this.f20874m = searchableInfo;
        this.f20877p = searchView.getSuggestionCommitIconResId();
        this.f20875n = context;
        this.f20876o = weakHashMap;
    }

    private void A(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    private Drawable j(String str) {
        Drawable.ConstantState constantState = (Drawable.ConstantState) this.f20876o.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    private CharSequence k(CharSequence charSequence) {
        if (this.f20880s == null) {
            TypedValue typedValue = new TypedValue();
            this.f20875n.getTheme().resolveAttribute(p144i.a.f43070K, typedValue, true);
            this.f20880s = this.f20875n.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f20880s, null), 0, charSequence.length(), 33);
        return spannableString;
    }

    private Drawable l(ComponentName componentName) {
        PackageManager packageManager = this.f20875n.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable != null) {
                return drawable;
            }
            Log.w("SuggestionsAdapter", "Invalid icon resource " + iconResource + " for " + componentName.flattenToShortString());
            return null;
        } catch (PackageManager.NameNotFoundException e10) {
            Log.w("SuggestionsAdapter", e10.toString());
            return null;
        }
    }

    private Drawable m(ComponentName componentName) {
        String strFlattenToShortString = componentName.flattenToShortString();
        if (!this.f20876o.containsKey(strFlattenToShortString)) {
            Drawable drawableL = l(componentName);
            this.f20876o.put(strFlattenToShortString, drawableL != null ? drawableL.getConstantState() : null);
            return drawableL;
        }
        Drawable.ConstantState constantState = (Drawable.ConstantState) this.f20876o.get(strFlattenToShortString);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable(this.f20875n.getResources());
    }

    public static String n(Cursor cursor, String str) {
        return v(cursor, cursor.getColumnIndex(str));
    }

    private Drawable o() {
        Drawable drawableM = m(this.f20874m.getSearchActivity());
        return drawableM != null ? drawableM : this.f20875n.getPackageManager().getDefaultActivityIcon();
    }

    private Drawable p(Uri uri) {
        try {
            if ("android.resource".equals(uri.getScheme())) {
                try {
                    return q(uri);
                } catch (Resources.NotFoundException unused) {
                    throw new FileNotFoundException("Resource does not exist: " + uri);
                }
            }
            InputStream inputStreamOpenInputStream = this.f20875n.getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream == null) {
                throw new FileNotFoundException("Failed to open " + uri);
            }
            try {
                Drawable drawableCreateFromStream = Drawable.createFromStream(inputStreamOpenInputStream, null);
                try {
                    inputStreamOpenInputStream.close();
                    return drawableCreateFromStream;
                } catch (IOException e10) {
                    Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e10);
                    return drawableCreateFromStream;
                }
            } catch (Throwable th) {
                try {
                    inputStreamOpenInputStream.close();
                } catch (IOException e11) {
                    Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e11);
                }
                throw th;
            }
        } catch (FileNotFoundException e12) {
            Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e12.getMessage());
            return null;
        }
        Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e12.getMessage());
        return null;
    }

    private Drawable r(String str) {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            int i10 = Integer.parseInt(str);
            String str2 = "android.resource://" + this.f20875n.getPackageName() + "/" + i10;
            Drawable drawableJ = j(str2);
            if (drawableJ != null) {
                return drawableJ;
            }
            Drawable drawableE = Z0.b.e(this.f20875n, i10);
            z(str2, drawableE);
            return drawableE;
        } catch (Resources.NotFoundException unused) {
            Log.w("SuggestionsAdapter", "Icon resource not found: " + str);
            return null;
        } catch (NumberFormatException unused2) {
            Drawable drawableJ2 = j(str);
            if (drawableJ2 != null) {
                return drawableJ2;
            }
            Drawable drawableP = p(Uri.parse(str));
            z(str, drawableP);
            return drawableP;
        }
    }

    private Drawable s(Cursor cursor) {
        int i10 = this.f20884w;
        if (i10 == -1) {
            return null;
        }
        Drawable drawableR = r(cursor.getString(i10));
        return drawableR != null ? drawableR : o();
    }

    private Drawable t(Cursor cursor) {
        int i10 = this.f20885x;
        if (i10 == -1) {
            return null;
        }
        return r(cursor.getString(i10));
    }

    private static String v(Cursor cursor, int i10) {
        if (i10 == -1) {
            return null;
        }
        try {
            return cursor.getString(i10);
        } catch (Exception e10) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e10);
            return null;
        }
    }

    private void x(ImageView imageView, Drawable drawable, int i10) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i10);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    private void y(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }

    private void z(String str, Drawable drawable) {
        if (drawable != null) {
            this.f20876o.put(str, drawable.getConstantState());
        }
    }

    @Override // p289q1.a, q1.b.a
    public void a(Cursor cursor) {
        if (this.f20878q) {
            Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.a(cursor);
            if (cursor != null) {
                this.f20881t = cursor.getColumnIndex("suggest_text_1");
                this.f20882u = cursor.getColumnIndex("suggest_text_2");
                this.f20883v = cursor.getColumnIndex("suggest_text_2_url");
                this.f20884w = cursor.getColumnIndex("suggest_icon_1");
                this.f20885x = cursor.getColumnIndex("suggest_icon_2");
                this.f20886y = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e10) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e10);
        }
    }

    @Override // q1.b.a
    public Cursor b(CharSequence charSequence) {
        String string = charSequence == null ? "" : charSequence.toString();
        if (this.f20873l.getVisibility() == 0 && this.f20873l.getWindowVisibility() == 0) {
            try {
                Cursor cursorU = u(this.f20874m, string, 50);
                if (cursorU != null) {
                    cursorU.getCount();
                    return cursorU;
                }
            } catch (RuntimeException e10) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e10);
            }
        }
        return null;
    }

    @Override // p289q1.a, q1.b.a
    public CharSequence convertToString(Cursor cursor) {
        String strN;
        String strN2;
        if (cursor == null) {
            return null;
        }
        String strN3 = n(cursor, "suggest_intent_query");
        if (strN3 != null) {
            return strN3;
        }
        if (this.f20874m.shouldRewriteQueryFromData() && (strN2 = n(cursor, "suggest_intent_data")) != null) {
            return strN2;
        }
        if (!this.f20874m.shouldRewriteQueryFromText() || (strN = n(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return strN;
    }

    @Override // p289q1.a
    public void d(View view, Context context, Cursor cursor) {
        a aVar = (a) view.getTag();
        int i10 = this.f20886y;
        int i11 = i10 != -1 ? cursor.getInt(i10) : 0;
        if (aVar.f20887a != null) {
            y(aVar.f20887a, v(cursor, this.f20881t));
        }
        if (aVar.f20888b != null) {
            String strV = v(cursor, this.f20883v);
            CharSequence charSequenceK = strV != null ? k(strV) : v(cursor, this.f20882u);
            if (TextUtils.isEmpty(charSequenceK)) {
                TextView textView = aVar.f20887a;
                if (textView != null) {
                    textView.setSingleLine(false);
                    aVar.f20887a.setMaxLines(2);
                }
            } else {
                TextView textView2 = aVar.f20887a;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    aVar.f20887a.setMaxLines(1);
                }
            }
            y(aVar.f20888b, charSequenceK);
        }
        ImageView imageView = aVar.f20889c;
        if (imageView != null) {
            x(imageView, s(cursor), 4);
        }
        ImageView imageView2 = aVar.f20890d;
        if (imageView2 != null) {
            x(imageView2, t(cursor), 8);
        }
        int i12 = this.f20879r;
        if (i12 != 2 && (i12 != 1 || (i11 & 1) == 0)) {
            aVar.f20891e.setVisibility(8);
            return;
        }
        aVar.f20891e.setVisibility(0);
        aVar.f20891e.setTag(aVar.f20887a.getText());
        aVar.f20891e.setOnClickListener(this);
    }

    @Override // p289q1.c, p289q1.a
    public View g(Context context, Cursor cursor, ViewGroup viewGroup) {
        View viewG = super.g(context, cursor, viewGroup);
        viewG.setTag(new a(viewG));
        ((ImageView) viewG.findViewById(p144i.f.f43200r)).setImageResource(this.f20877p);
        return viewG;
    }

    @Override // p289q1.a, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i10, view, viewGroup);
        } catch (RuntimeException e10) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e10);
            View viewF = f(this.f20875n, c(), viewGroup);
            if (viewF != null) {
                ((a) viewF.getTag()).f20887a.setText(e10.toString());
            }
            return viewF;
        }
    }

    @Override // p289q1.a, android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i10, view, viewGroup);
        } catch (RuntimeException e10) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e10);
            View viewG = g(this.f20875n, c(), viewGroup);
            if (viewG != null) {
                ((a) viewG.getTag()).f20887a.setText(e10.toString());
            }
            return viewG;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        A(c());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        A(c());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f20873l.S((CharSequence) tag);
        }
    }

    Drawable q(Uri uri) throws FileNotFoundException {
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.f20875n.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    identifier = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else {
                if (size != 2) {
                    throw new FileNotFoundException("More than two path segments: " + uri);
                }
                identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (identifier != 0) {
                return resourcesForApplication.getDrawable(identifier);
            }
            throw new FileNotFoundException("No resource found for: " + uri);
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException("No package found for authority: " + uri);
        }
    }

    Cursor u(SearchableInfo searchableInfo, String str, int i10) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder builderFragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            builderFragment.appendEncodedPath(suggestPath);
        }
        builderFragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            builderFragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i10 > 0) {
            builderFragment.appendQueryParameter("limit", String.valueOf(i10));
        }
        return this.f20875n.getContentResolver().query(builderFragment.build(), null, suggestSelection, strArr2, null);
    }

    public void w(int i10) {
        this.f20879r = i10;
    }
}
