package com.revature.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.model.Holiday;
import com.revature.model.Role;
import com.revature.service.HolidayService;
import com.revature.service.RoleService;

@CrossOrigin
@RestController
@RequestMapping("/roles")
public class RoleController {

	@Autowired
	private RoleService roleService;

	@GetMapping
	public List<Role> list() {
		return roleService.list();
	}

	@GetMapping("/{id}")
	public Role findById(@PathVariable("id") Long id) {
		return roleService.findById(id);
	}

	@PostMapping
	public void save(@RequestBody Role role) {
		roleService.save(role);
	}

	@PutMapping
	public void update(@RequestBody Role role) {
		roleService.update(role);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Long id) {
		roleService.delete(id);
	}
}
