// ============================================
// E-Commerce Admin Dashboard — Application Logic
// ============================================

(() => {
  'use strict';

  // --- Base API URL ---
  const API_BASE = '';  // Same origin since served from Spring Boot

  // --- Entity Configuration ---
  const entityConfig = {
    User: {
      idField: 'id', endpoint: 'user', displayName: 'User', icon: '👤',
      fields: [
        { name: 'id', type: 'number', label: 'ID' },
        { name: 'name', type: 'text', label: 'Name' },
        { name: 'adhar', type: 'text', label: 'Aadhar' },
        { name: 'panno', type: 'text', label: 'PAN No' },
        { name: 'mailid', type: 'email', label: 'Email' },
        { name: 'dob', type: 'date', label: 'Date of Birth' },
        { name: 'mobileno', type: 'text', label: 'Mobile No' }
      ]
    },
    Admin: {
      idField: 'id', endpoint: 'admin', displayName: 'Admin', icon: '🛡️',
      fields: [
        { name: 'id', type: 'number', label: 'ID' },
        { name: 'name', type: 'text', label: 'Name' },
        { name: 'adhar', type: 'text', label: 'Aadhar' },
        { name: 'panno', type: 'text', label: 'PAN No' },
        { name: 'mailid', type: 'email', label: 'Email' },
        { name: 'dob', type: 'date', label: 'Date of Birth' },
        { name: 'mobileNO', type: 'text', label: 'Mobile No' },
        { name: 'doj', type: 'date', label: 'Date of Joining' },
        { name: 'experience', type: 'text', label: 'Experience' }
      ]
    },
    Role: {
      idField: 'id', endpoint: 'role', displayName: 'Role', icon: '🏷️',
      fields: [
        { name: 'id', type: 'number', label: 'ID' },
        { name: 'name', type: 'text', label: 'Role Name' }
      ]
    },
    Owner: {
      idField: 'id', endpoint: 'owner', displayName: 'Owner', icon: '👑',
      fields: [
        { name: 'id', type: 'number', label: 'ID' },
        { name: 'name', type: 'text', label: 'Name' },
        { name: 'adhar', type: 'text', label: 'Aadhar' },
        { name: 'panno', type: 'text', label: 'PAN No' },
        { name: 'mailid', type: 'email', label: 'Email' },
        { name: 'income', type: 'number', label: 'Income' },
        { name: 'experience', type: 'text', label: 'Experience' },
        { name: 'dob', type: 'date', label: 'Date of Birth' },
        { name: 'mobileNO', type: 'text', label: 'Mobile No' }
      ]
    },
    Manager: {
      idField: 'id', endpoint: 'manager', displayName: 'Manager', icon: '💼',
      fields: [
        { name: 'id', type: 'number', label: 'ID' },
        { name: 'name', type: 'text', label: 'Name' },
        { name: 'adhar', type: 'text', label: 'Aadhar' },
        { name: 'panno', type: 'text', label: 'PAN No' },
        { name: 'mailid', type: 'email', label: 'Email' },
        { name: 'experience', type: 'text', label: 'Experience' },
        { name: 'salary', type: 'number', label: 'Salary' },
        { name: 'dob', type: 'date', label: 'Date of Birth' },
        { name: 'doj', type: 'date', label: 'Date of Joining' },
        { name: 'mobileNo', type: 'text', label: 'Mobile No' }
      ]
    },
    Employee: {
      idField: 'id', endpoint: 'employee', displayName: 'Employee', icon: '🧑‍💻',
      fields: [
        { name: 'id', type: 'number', label: 'ID' },
        { name: 'name', type: 'text', label: 'Name' },
        { name: 'adhar', type: 'text', label: 'Aadhar' },
        { name: 'panno', type: 'text', label: 'PAN No' },
        { name: 'mailid', type: 'email', label: 'Email' },
        { name: 'doj', type: 'date', label: 'Date of Joining' },
        { name: 'experience', type: 'text', label: 'Experience' },
        { name: 'dob', type: 'date', label: 'Date of Birth' },
        { name: 'mobileNO', type: 'text', label: 'Mobile No' }
      ]
    },
    Company: {
      idField: 'regNo', endpoint: 'company', displayName: 'Company', icon: '🏢',
      fields: [
        { name: 'regNo', type: 'number', label: 'Reg No' },
        { name: 'name', type: 'text', label: 'Company Name' }
      ]
    },
    Type: {
      idField: 'tid', endpoint: 'type', displayName: 'Type', icon: '🏷️',
      fields: [
        { name: 'tid', type: 'number', label: 'Type ID' },
        { name: 'name', type: 'text', label: 'Type Name' }
      ]
    },
    Dept: {
      idField: 'did', endpoint: 'dept', displayName: 'Department', icon: '🏛️',
      fields: [
        { name: 'did', type: 'number', label: 'Dept ID' },
        { name: 'name', type: 'text', label: 'Dept Name' }
      ]
    },
    Product: {
      idField: 'pid', endpoint: 'product', displayName: 'Product', icon: '📦',
      fields: [
        { name: 'pid', type: 'number', label: 'Product ID' },
        { name: 'name', type: 'text', label: 'Product Name' },
        { name: 'price', type: 'number', label: 'Price' }
      ]
    },
    Category: {
      idField: 'cid', endpoint: 'category', displayName: 'Category', icon: '📁',
      fields: [
        { name: 'cid', type: 'number', label: 'Category ID' },
        { name: 'name', type: 'text', label: 'Category Name' }
      ]
    },
    SubCategory: {
      idField: 'sid', endpoint: 'subCategory', displayName: 'SubCategory', icon: '📂',
      fields: [
        { name: 'sid', type: 'number', label: 'SubCategory ID' },
        { name: 'name', type: 'text', label: 'SubCategory Name' }
      ]
    },
    Brand: {
      idField: 'bid', endpoint: 'brand', displayName: 'Brand', icon: '🏅',
      fields: [
        { name: 'bid', type: 'number', label: 'Brand ID' },
        { name: 'name', type: 'text', label: 'Brand Name' }
      ]
    },
    ProductReview: {
      idField: 'prid', endpoint: 'productReview', displayName: 'Product Review', icon: '⭐',
      fields: [
        { name: 'prid', type: 'number', label: 'Review ID' },
        { name: 'review', type: 'text', label: 'Review' }
      ]
    },
    Orders: {
      idField: 'oId', endpoint: 'orders', displayName: 'Orders', icon: '🛒',
      fields: [
        { name: 'oId', type: 'number', label: 'Order ID' },
        { name: 'name', type: 'text', label: 'Order Name' }
      ]
    },
    PaymentMode: {
      idField: 'pmid', endpoint: 'paymentMode', displayName: 'Payment Mode', icon: '💳',
      fields: [
        { name: 'pmid', type: 'number', label: 'Payment ID' },
        { name: 'dateofpayment', type: 'date', label: 'Payment Date' },
        { name: 'status', type: 'checkbox', label: 'Status' }
      ]
    },
    Card: {
      idField: 'cid', endpoint: 'card', displayName: 'Card', icon: '💳',
      fields: [
        { name: 'cid', type: 'number', label: 'Card ID' },
        { name: 'amount', type: 'number', label: 'Amount' }
      ]
    },
    Upi: {
      idField: 'uid', endpoint: 'upi', displayName: 'UPI', icon: '📱',
      fields: [
        { name: 'uid', type: 'number', label: 'UPI ID' },
        { name: 'amount', type: 'number', label: 'Amount' }
      ]
    },
    Cod: {
      idField: 'cid', endpoint: 'cod', displayName: 'COD', icon: '💵',
      fields: [
        { name: 'cid', type: 'number', label: 'COD ID' },
        { name: 'amount', type: 'number', label: 'Amount' }
      ]
    },
    ShippingDetails: {
      idField: 'sid', endpoint: 'shippingDetails', displayName: 'Shipping Details', icon: '🚚',
      fields: [
        { name: 'sid', type: 'number', label: 'Shipping ID' }
      ]
    },
    Invoice: {
      idField: 'iid', endpoint: 'invoice', displayName: 'Invoice', icon: '🧾',
      fields: [
        { name: 'iid', type: 'number', label: 'Invoice ID' }
      ]
    },
    Tracking: {
      idField: 'id', endpoint: 'tracking', displayName: 'Tracking', icon: '📍',
      fields: [
        { name: 'id', type: 'number', label: 'Tracking ID' }
      ]
    },
    Feedback: {
      idField: 'id', endpoint: 'feedback', displayName: 'Feedback', icon: '📝',
      fields: [
        { name: 'id', type: 'number', label: 'Feedback ID' }
      ]
    },
    CustomerQuery: {
      idField: 'id', endpoint: 'customerQuery', displayName: 'Customer Query', icon: '❓',
      fields: [
        { name: 'id', type: 'number', label: 'Query ID' }
      ]
    },
    CompanyResponse: {
      idField: 'id', endpoint: 'companyResponse', displayName: 'Company Response', icon: '💬',
      fields: [
        { name: 'id', type: 'number', label: 'Response ID' },
        { name: 'message', type: 'text', label: 'Message' }
      ]
    },
    Country: {
      idField: 'id', endpoint: 'country', displayName: 'Country', icon: '🌍',
      fields: [
        { name: 'id', type: 'number', label: 'ID' },
        { name: 'name', type: 'text', label: 'Country Name' }
      ]
    },
    State: {
      idField: 'id', endpoint: 'state', displayName: 'State', icon: '🗺️',
      fields: [
        { name: 'id', type: 'number', label: 'ID' },
        { name: 'name', type: 'text', label: 'State Name' }
      ]
    },
    District: {
      idField: 'id', endpoint: 'district', displayName: 'District', icon: '📍',
      fields: [
        { name: 'id', type: 'number', label: 'ID' },
        { name: 'name', type: 'text', label: 'District Name' }
      ]
    },
    Taluka: {
      idField: 'id', endpoint: 'taluka', displayName: 'Taluka', icon: '🏘️',
      fields: [
        { name: 'id', type: 'number', label: 'ID' },
        { name: 'name', type: 'text', label: 'Taluka Name' }
      ]
    },
    Town: {
      idField: 'id', endpoint: 'town', displayName: 'Town', icon: '🏙️',
      fields: [
        { name: 'id', type: 'number', label: 'ID' },
        { name: 'name', type: 'text', label: 'Town Name' }
      ]
    },
    Address: {
      idField: 'flatno', endpoint: 'address', displayName: 'Address', icon: '📫',
      fields: [
        { name: 'flatno', type: 'number', label: 'Flat No' },
        { name: 'area', type: 'text', label: 'Area' },
        { name: 'pincode', type: 'number', label: 'Pincode' }
      ]
    }
  };

  // --- Capitalize helper: "user" → "User" ---
  function capitalize(str) {
    if (!str) return '';
    return str.charAt(0).toUpperCase() + str.slice(1);
  }

  // --- Build API URLs for an entity ---
  // Handles the special User endpoint pattern (no slash before id in updateUser)
  function getApiUrls(entityKey) {
    const cfg = entityConfig[entityKey];
    const ep = cfg.endpoint;
    const name = capitalize(ep);

    // Special case: User update has no slash before {id}
    if (entityKey === 'User') {
      return {
        getAll:   `${API_BASE}/${ep}/All${name}Data`,
        getOne:   (id) => `${API_BASE}/${ep}/Single${name}/${id}`,
        create:   `${API_BASE}/${ep}/save${name}`,
        update:   (id) => `${API_BASE}/${ep}/update${name}${id}`,
        delete:   (id) => `${API_BASE}/${ep}/delete${name}/${id}`
      };
    }

    return {
      getAll:   `${API_BASE}/${ep}/All${name}Data`,
      getOne:   (id) => `${API_BASE}/${ep}/Single${name}/${id}`,
      create:   `${API_BASE}/${ep}/save${name}`,
      update:   (id) => `${API_BASE}/${ep}/update${name}/${id}`,
      delete:   (id) => `${API_BASE}/${ep}/delete${name}/${id}`
    };
  }

  // --- State ---
  let currentEntity = null;
  let currentData = [];
  let editingId = null;
  let deleteId = null;

  // --- DOM References ---
  const $ = (sel) => document.querySelector(sel);
  const $$ = (sel) => document.querySelectorAll(sel);

  const sidebarEl = $('#sidebar');
  const sidebarNav = $('#sidebarNav');
  const mainContent = $('#mainContent');
  const menuToggle = $('#menuToggle');
  const breadcrumbCurrent = $('#breadcrumbCurrent');
  const dashboardView = $('#dashboardView');
  const entityView = $('#entityView');
  const entityTitle = $('#entityTitle');
  const entityBadge = $('#entityBadge');
  const addNewBtn = $('#addNewBtn');
  const loadingSpinner = $('#loadingSpinner');
  const tableContainer = $('#tableContainer');
  const tableHead = $('#tableHead');
  const tableBody = $('#tableBody');
  const emptyState = $('#emptyState');
  const modalOverlay = $('#modalOverlay');
  const modal = $('#modal');
  const modalTitle = $('#modalTitle');
  const modalForm = $('#modalForm');
  const formFields = $('#formFields');
  const modalClose = $('#modalClose');
  const modalCancel = $('#modalCancel');
  const deleteOverlay = $('#deleteOverlay');
  const deleteClose = $('#deleteClose');
  const deleteCancelBtn = $('#deleteCancelBtn');
  const deleteConfirmBtn = $('#deleteConfirmBtn');
  const toastContainer = $('#toastContainer');
  const quickGrid = $('#quickGrid');
  const globalSearch = $('#globalSearch');

  // =====================
  // SIDEBAR LOGIC
  // =====================

  // Toggle nav groups
  document.querySelectorAll('.nav-group-title').forEach(title => {
    title.addEventListener('click', () => {
      const group = title.getAttribute('data-group');
      const items = document.getElementById(`group-${group}`);
      const isOpen = items.classList.contains('open');

      // Toggle
      if (isOpen) {
        items.classList.remove('open');
        title.classList.remove('expanded');
      } else {
        items.classList.add('open');
        title.classList.add('expanded');
      }
    });
  });

  // Nav item clicks
  sidebarNav.addEventListener('click', (e) => {
    const navItem = e.target.closest('.nav-item');
    if (!navItem) return;

    const entity = navItem.getAttribute('data-entity');
    if (!entity) return;

    // Remove active from all
    $$('.nav-item').forEach(el => el.classList.remove('active'));
    navItem.classList.add('active');

    if (entity === 'dashboard') {
      showDashboard();
    } else {
      navigateToEntity(entity);
    }

    // Close sidebar on mobile
    if (window.innerWidth <= 1024) {
      closeSidebar();
    }
  });

  // Mobile menu toggle
  menuToggle.addEventListener('click', () => {
    sidebarEl.classList.toggle('open');
    toggleBackdrop();
  });

  function closeSidebar() {
    sidebarEl.classList.remove('open');
    removeBackdrop();
  }

  function toggleBackdrop() {
    let backdrop = document.querySelector('.sidebar-backdrop');
    if (sidebarEl.classList.contains('open')) {
      if (!backdrop) {
        backdrop = document.createElement('div');
        backdrop.className = 'sidebar-backdrop active';
        backdrop.addEventListener('click', closeSidebar);
        document.body.appendChild(backdrop);
      } else {
        backdrop.classList.add('active');
      }
    } else {
      removeBackdrop();
    }
  }

  function removeBackdrop() {
    const backdrop = document.querySelector('.sidebar-backdrop');
    if (backdrop) {
      backdrop.classList.remove('active');
      setTimeout(() => backdrop.remove(), 300);
    }
  }

  // =====================
  // DASHBOARD VIEW
  // =====================
  function showDashboard() {
    currentEntity = null;
    dashboardView.style.display = 'block';
    entityView.style.display = 'none';
    breadcrumbCurrent.textContent = 'Dashboard';
  }

  // Populate quick access grid
  function populateQuickGrid() {
    const entities = Object.keys(entityConfig);
    quickGrid.innerHTML = entities.map(key => {
      const cfg = entityConfig[key];
      return `
        <div class="quick-card" data-entity="${key}" id="quick-${key}">
          <div class="quick-card-icon">${cfg.icon}</div>
          <div class="quick-card-label">${cfg.displayName}</div>
        </div>
      `;
    }).join('');

    quickGrid.addEventListener('click', (e) => {
      const card = e.target.closest('.quick-card');
      if (!card) return;
      const entity = card.getAttribute('data-entity');

      // Activate sidebar item
      $$('.nav-item').forEach(el => el.classList.remove('active'));
      const navItem = document.getElementById(`nav-${entity}`);
      if (navItem) {
        navItem.classList.add('active');
        // Open parent group
        const groupItems = navItem.closest('.nav-group-items');
        if (groupItems) {
          groupItems.classList.add('open');
          const groupTitle = groupItems.previousElementSibling;
          if (groupTitle) groupTitle.classList.add('expanded');
        }
      }

      navigateToEntity(entity);
    });
  }

  // =====================
  // ENTITY VIEW
  // =====================
  function navigateToEntity(entityKey) {
    if (!entityConfig[entityKey]) return;

    currentEntity = entityKey;
    const cfg = entityConfig[entityKey];

    dashboardView.style.display = 'none';
    entityView.style.display = 'block';
    // Re-trigger animation
    entityView.style.animation = 'none';
    entityView.offsetHeight; // reflow
    entityView.style.animation = '';

    entityTitle.textContent = `${cfg.icon} ${cfg.displayName} Management`;
    breadcrumbCurrent.textContent = cfg.displayName;

    loadEntityData(entityKey);
  }

  async function loadEntityData(entityKey) {
    const cfg = entityConfig[entityKey];
    const urls = getApiUrls(entityKey);

    showLoading(true);
    try {
      const resp = await fetch(urls.getAll);
      if (!resp.ok) throw new Error(`HTTP ${resp.status}`);
      const data = await resp.json();
      currentData = Array.isArray(data) ? data : [];
      renderTable(entityKey, currentData);
    } catch (err) {
      console.error('Failed to load data:', err);
      currentData = [];
      renderTable(entityKey, []);
      showToast('error', `Failed to load ${cfg.displayName} data. ${err.message}`);
    } finally {
      showLoading(false);
    }
  }

  function showLoading(show) {
    loadingSpinner.style.display = show ? 'flex' : 'none';
    tableContainer.style.display = show ? 'none' : 'block';
  }

  function renderTable(entityKey, data) {
    const cfg = entityConfig[entityKey];
    const fields = cfg.fields;

    // Update badge
    entityBadge.textContent = `${data.length} record${data.length !== 1 ? 's' : ''}`;

    if (data.length === 0) {
      tableContainer.querySelector('.data-table').style.display = 'none';
      emptyState.style.display = 'block';
      return;
    }

    tableContainer.querySelector('.data-table').style.display = 'table';
    emptyState.style.display = 'none';

    // Build header
    tableHead.innerHTML = `<tr>${
      fields.map(f => `<th>${f.label}</th>`).join('')
    }<th>Actions</th></tr>`;

    // Build rows
    tableBody.innerHTML = data.map(item => {
      const cells = fields.map(f => {
        let val = item[f.name];
        if (val === null || val === undefined) val = '—';
        if (f.type === 'checkbox') val = val ? '✅ Active' : '❌ Inactive';
        return `<td>${val}</td>`;
      }).join('');

      const id = item[cfg.idField];
      return `<tr>
        ${cells}
        <td class="table-actions">
          <button class="btn btn-icon edit" data-id="${id}" title="Edit" aria-label="Edit record ${id}">
            <svg width="16" height="16" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2"><path d="M11 4H4a2 2 0 0 0-2 2v14a2 2 0 0 0 2 2h14a2 2 0 0 0 2-2v-7"/><path d="M18.5 2.5a2.121 2.121 0 0 1 3 3L12 15l-4 1 1-4 9.5-9.5z"/></svg>
          </button>
          <button class="btn btn-icon delete" data-id="${id}" title="Delete" aria-label="Delete record ${id}">
            <svg width="16" height="16" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2"><polyline points="3 6 5 6 21 6"/><path d="M19 6v14a2 2 0 0 1-2 2H7a2 2 0 0 1-2-2V6m3 0V4a2 2 0 0 1 2-2h4a2 2 0 0 1 2 2v2"/></svg>
          </button>
        </td>
      </tr>`;
    }).join('');
  }

  // Table action clicks (event delegation)
  tableBody.addEventListener('click', (e) => {
    const editBtn = e.target.closest('.btn-icon.edit');
    const deleteBtn = e.target.closest('.btn-icon.delete');

    if (editBtn) {
      const id = editBtn.getAttribute('data-id');
      openEditModal(id);
    }
    if (deleteBtn) {
      const id = deleteBtn.getAttribute('data-id');
      openDeleteModal(id);
    }
  });

  // =====================
  // ADD / EDIT MODAL
  // =====================
  addNewBtn.addEventListener('click', () => openAddModal());

  function openAddModal() {
    editingId = null;
    modalTitle.textContent = `Add New ${entityConfig[currentEntity].displayName}`;
    buildForm(currentEntity, null);
    openModal(modalOverlay);
  }

  function openEditModal(id) {
    const cfg = entityConfig[currentEntity];
    const record = currentData.find(item => String(item[cfg.idField]) === String(id));
    if (!record) {
      showToast('error', 'Record not found');
      return;
    }

    editingId = id;
    modalTitle.textContent = `Edit ${cfg.displayName}`;
    buildForm(currentEntity, record);
    openModal(modalOverlay);
  }

  function buildForm(entityKey, data) {
    const cfg = entityConfig[entityKey];
    formFields.innerHTML = cfg.fields.map(f => {
      const val = data ? (data[f.name] !== null && data[f.name] !== undefined ? data[f.name] : '') : '';

      if (f.type === 'checkbox') {
        const checked = data ? data[f.name] : false;
        return `
          <div class="form-group">
            <label for="field-${f.name}">${f.label}</label>
            <div class="checkbox-wrapper">
              <input type="checkbox" id="field-${f.name}" name="${f.name}" ${checked ? 'checked' : ''}>
              <span class="form-group-label" style="color: var(--text-secondary); font-size: 0.85rem;">Enable ${f.label}</span>
            </div>
          </div>
        `;
      }

      // If editing, make the ID field readonly
      const isId = f.name === cfg.idField;
      const readonly = (isId && data) ? 'readonly style="opacity:0.6;cursor:not-allowed;"' : '';

      return `
        <div class="form-group">
          <label for="field-${f.name}">${f.label}</label>
          <input type="${f.type}" id="field-${f.name}" name="${f.name}" value="${val}" placeholder="Enter ${f.label.toLowerCase()}" ${readonly}>
        </div>
      `;
    }).join('');
  }

  // Form submit
  modalForm.addEventListener('submit', async (e) => {
    e.preventDefault();
    if (!currentEntity) return;

    const cfg = entityConfig[currentEntity];
    const urls = getApiUrls(currentEntity);
    const formData = {};

    cfg.fields.forEach(f => {
      const el = document.getElementById(`field-${f.name}`);
      if (!el) return;

      if (f.type === 'checkbox') {
        formData[f.name] = el.checked;
      } else if (f.type === 'number') {
        formData[f.name] = el.value ? Number(el.value) : null;
      } else {
        formData[f.name] = el.value;
      }
    });

    const isEdit = editingId !== null;
    const url = isEdit ? urls.update(editingId) : urls.create;
    const method = isEdit ? 'PUT' : 'POST';

    try {
      const resp = await fetch(url, {
        method,
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify(formData)
      });

      if (!resp.ok) throw new Error(`HTTP ${resp.status}`);

      showToast('success', `${cfg.displayName} ${isEdit ? 'updated' : 'created'} successfully!`);
      closeModal(modalOverlay);
      loadEntityData(currentEntity);
    } catch (err) {
      console.error('Save failed:', err);
      showToast('error', `Failed to ${isEdit ? 'update' : 'create'} ${cfg.displayName}. ${err.message}`);
    }
  });

  // =====================
  // DELETE MODAL
  // =====================
  function openDeleteModal(id) {
    deleteId = id;
    openModal(deleteOverlay);
  }

  deleteConfirmBtn.addEventListener('click', async () => {
    if (!currentEntity || deleteId === null) return;

    const cfg = entityConfig[currentEntity];
    const urls = getApiUrls(currentEntity);

    try {
      const resp = await fetch(urls.delete(deleteId), { method: 'DELETE' });
      if (!resp.ok) throw new Error(`HTTP ${resp.status}`);

      showToast('success', `${cfg.displayName} deleted successfully!`);
      closeModal(deleteOverlay);
      loadEntityData(currentEntity);
    } catch (err) {
      console.error('Delete failed:', err);
      showToast('error', `Failed to delete ${cfg.displayName}. ${err.message}`);
    }
  });

  // =====================
  // MODAL HELPERS
  // =====================
  function openModal(overlay) {
    overlay.classList.add('active');
    document.body.style.overflow = 'hidden';
  }

  function closeModal(overlay) {
    overlay.classList.remove('active');
    document.body.style.overflow = '';
    editingId = null;
    deleteId = null;
  }

  modalClose.addEventListener('click', () => closeModal(modalOverlay));
  modalCancel.addEventListener('click', () => closeModal(modalOverlay));
  deleteClose.addEventListener('click', () => closeModal(deleteOverlay));
  deleteCancelBtn.addEventListener('click', () => closeModal(deleteOverlay));

  // Close modal on overlay click
  modalOverlay.addEventListener('click', (e) => {
    if (e.target === modalOverlay) closeModal(modalOverlay);
  });
  deleteOverlay.addEventListener('click', (e) => {
    if (e.target === deleteOverlay) closeModal(deleteOverlay);
  });

  // Close on Escape key
  document.addEventListener('keydown', (e) => {
    if (e.key === 'Escape') {
      if (modalOverlay.classList.contains('active')) closeModal(modalOverlay);
      if (deleteOverlay.classList.contains('active')) closeModal(deleteOverlay);
    }
  });

  // =====================
  // TOAST NOTIFICATIONS
  // =====================
  function showToast(type, message) {
    const icons = {
      success: '✅',
      error: '❌',
      info: 'ℹ️'
    };

    const toast = document.createElement('div');
    toast.className = `toast ${type}`;
    toast.innerHTML = `
      <span class="toast-icon">${icons[type] || 'ℹ️'}</span>
      <span class="toast-message">${message}</span>
      <button class="toast-close" aria-label="Close notification">&times;</button>
      <div class="toast-progress"></div>
    `;

    toastContainer.appendChild(toast);

    // Close button
    toast.querySelector('.toast-close').addEventListener('click', () => {
      removeToast(toast);
    });

    // Auto remove after 4s
    setTimeout(() => {
      removeToast(toast);
    }, 4000);
  }

  function removeToast(toast) {
    if (toast.classList.contains('toast-out')) return;
    toast.classList.add('toast-out');
    setTimeout(() => {
      if (toast.parentNode) toast.parentNode.removeChild(toast);
    }, 300);
  }

  // =====================
  // GLOBAL SEARCH
  // =====================
  globalSearch.addEventListener('input', (e) => {
    const query = e.target.value.toLowerCase().trim();
    const navItems = $$('.nav-item[data-entity]');

    if (!query) {
      navItems.forEach(item => item.style.display = '');
      return;
    }

    navItems.forEach(item => {
      const entity = item.getAttribute('data-entity');
      if (entity === 'dashboard') {
        item.style.display = '';
        return;
      }
      const cfg = entityConfig[entity];
      if (!cfg) return;
      const match = cfg.displayName.toLowerCase().includes(query) || entity.toLowerCase().includes(query);
      item.style.display = match ? '' : 'none';

      // Open parent group if match
      if (match) {
        const groupItems = item.closest('.nav-group-items');
        if (groupItems) {
          groupItems.classList.add('open');
          const groupTitle = groupItems.previousElementSibling;
          if (groupTitle) groupTitle.classList.add('expanded');
        }
      }
    });
  });

  // =====================
  // INITIALIZATION
  // =====================
  function init() {
    populateQuickGrid();

    // Open "People Management" group by default
    const peopleGroup = document.getElementById('group-people');
    if (peopleGroup) {
      peopleGroup.classList.add('open');
      const title = peopleGroup.previousElementSibling;
      if (title) title.classList.add('expanded');
    }

    showDashboard();
  }

  init();

})();
