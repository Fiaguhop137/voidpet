package p233n;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.AbstractC1896b;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class c extends p233n.b implements MenuItem {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p074e1.b f49427d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Method f49428e;

    private class a extends AbstractC1896b implements ActionProvider.VisibilityListener {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private AbstractC1896b.InterfaceC0280b f49429d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final ActionProvider f49430e;

        a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f49430e = actionProvider;
        }

        @Override // androidx.core.view.AbstractC1896b
        public boolean a() {
            return this.f49430e.hasSubMenu();
        }

        @Override // androidx.core.view.AbstractC1896b
        public boolean b() {
            return this.f49430e.isVisible();
        }

        @Override // androidx.core.view.AbstractC1896b
        public View c(MenuItem menuItem) {
            return this.f49430e.onCreateActionView(menuItem);
        }

        @Override // androidx.core.view.AbstractC1896b
        public boolean d() {
            return this.f49430e.onPerformDefaultAction();
        }

        @Override // androidx.core.view.AbstractC1896b
        public void e(SubMenu subMenu) {
            this.f49430e.onPrepareSubMenu(c.this.d(subMenu));
        }

        @Override // androidx.core.view.AbstractC1896b
        public boolean f() {
            return this.f49430e.overridesItemVisibility();
        }

        @Override // androidx.core.view.AbstractC1896b
        public void i(AbstractC1896b.InterfaceC0280b interfaceC0280b) {
            this.f49429d = interfaceC0280b;
            this.f49430e.setVisibilityListener(interfaceC0280b != null ? this : null);
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z10) {
            AbstractC1896b.InterfaceC0280b interfaceC0280b = this.f49429d;
            if (interfaceC0280b != null) {
                interfaceC0280b.onActionProviderVisibilityChanged(z10);
            }
        }
    }

    static class b extends FrameLayout implements androidx.appcompat.view.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final CollapsibleActionView f49432a;

        /* JADX WARN: Multi-variable type inference failed */
        b(View view) {
            super(view.getContext());
            this.f49432a = (CollapsibleActionView) view;
            addView(view);
        }

        View a() {
            return (View) this.f49432a;
        }

        @Override // androidx.appcompat.view.c
        public void onActionViewCollapsed() {
            this.f49432a.onActionViewCollapsed();
        }

        @Override // androidx.appcompat.view.c
        public void onActionViewExpanded() {
            this.f49432a.onActionViewExpanded();
        }
    }

    /* JADX INFO: renamed from: n.c$c, reason: collision with other inner class name */
    private class MenuItemOnActionExpandListenerC0586c implements MenuItem.OnActionExpandListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final MenuItem.OnActionExpandListener f49433a;

        MenuItemOnActionExpandListenerC0586c(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f49433a = onActionExpandListener;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f49433a.onMenuItemActionCollapse(c.this.c(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f49433a.onMenuItemActionExpand(c.this.c(menuItem));
        }
    }

    private class d implements MenuItem.OnMenuItemClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final MenuItem.OnMenuItemClickListener f49435a;

        d(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f49435a = onMenuItemClickListener;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f49435a.onMenuItemClick(c.this.c(menuItem));
        }
    }

    public c(Context context, p074e1.b bVar) {
        super(context);
        if (bVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f49427d = bVar;
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return this.f49427d.collapseActionView();
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return this.f49427d.expandActionView();
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        AbstractC1896b abstractC1896bA = this.f49427d.a();
        if (abstractC1896bA instanceof a) {
            return ((a) abstractC1896bA).f49430e;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        View actionView = this.f49427d.getActionView();
        return actionView instanceof b ? ((b) actionView).a() : actionView;
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f49427d.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f49427d.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f49427d.getContentDescription();
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f49427d.getGroupId();
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f49427d.getIcon();
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f49427d.getIconTintList();
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f49427d.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f49427d.getIntent();
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f49427d.getItemId();
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f49427d.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return this.f49427d.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f49427d.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f49427d.getOrder();
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return d(this.f49427d.getSubMenu());
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f49427d.getTitle();
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        return this.f49427d.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f49427d.getTooltipText();
    }

    public void h(boolean z10) {
        try {
            if (this.f49428e == null) {
                this.f49428e = this.f49427d.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }
            this.f49428e.invoke(this.f49427d, Boolean.valueOf(z10));
        } catch (Exception e10) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e10);
        }
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f49427d.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f49427d.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return this.f49427d.isCheckable();
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return this.f49427d.isChecked();
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return this.f49427d.isEnabled();
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return this.f49427d.isVisible();
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        a aVar = new a(this.f49424a, actionProvider);
        p074e1.b bVar = this.f49427d;
        if (actionProvider == null) {
            aVar = null;
        }
        bVar.b(aVar);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i10) {
        this.f49427d.setActionView(i10);
        View actionView = this.f49427d.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f49427d.setActionView(new b(actionView));
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new b(view);
        }
        this.f49427d.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        this.f49427d.setAlphabeticShortcut(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f49427d.setAlphabeticShortcut(c10, i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z10) {
        this.f49427d.setCheckable(z10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z10) {
        this.f49427d.setChecked(z10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f49427d.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z10) {
        this.f49427d.setEnabled(z10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        this.f49427d.setIcon(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f49427d.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f49427d.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f49427d.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f49427d.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        this.f49427d.setNumericShortcut(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10, int i10) {
        this.f49427d.setNumericShortcut(c10, i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f49427d.setOnActionExpandListener(onActionExpandListener != null ? new MenuItemOnActionExpandListenerC0586c(onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f49427d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new d(onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.f49427d.setShortcut(c10, c11);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f49427d.setShortcut(c10, c11, i10, i11);
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i10) {
        this.f49427d.setShowAsAction(i10);
    }

    @Override // android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i10) {
        this.f49427d.setShowAsActionFlags(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        this.f49427d.setTitle(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f49427d.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f49427d.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f49427d.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z10) {
        return this.f49427d.setVisible(z10);
    }
}
