<template>
  <div>
    <h1>h-table Demo</h1>
    <h-table :data="tableData" :columns="columns" />
  </div>
</template>

<script setup>
import { ref } from 'vue';
import 'h-table/dist/style.css';

const tableData = ref([
  { id: 1, name: 'Alice', age: 25 },
  { id: 2, name: 'Bob', age: 30 },
  { id: 3, name: 'Charlie', age: 35 }
]);

const columns = [
  { field: 'id', label: 'ID' },
  { field: 'name', label: 'Name' },
  { field: 'age', label: 'Age' }
];
</script>
