const API_BASE_URL = "http://localhost:8080/api";

async function loadBins() {
  const container = document.getElementById("binsContainer");
  const summary = document.getElementById("summaryData");

  try {
    const response = await fetch(`${API_BASE_URL}/bins`);
    const bins = await response.json();

    container.innerHTML = "";

    let full = 0, empty = 0;

    bins.forEach(bin => {

      const fill = bin.fillPercentage; // ✅ FIXED

      if (fill >= 70) full++;
      else empty++;

      const color = fill >= 70 ? "red" : "green";

      container.innerHTML += `
        <div class="bin-card">
          <h3>${bin.location}</h3>
          <p>${bin.city}, ${bin.state}</p>
          <p>Fill: ${fill}%</p>

          <div class="progress-bar">
            <div class="progress" style="width:${fill}%; background:${color}"></div>
          </div>

          <p>Status: ${fill >= 70 ? "Full" : "Empty"}</p>
        </div>
      `;
    });

    summary.innerText = `Total: ${bins.length} | Full: ${full} | Empty: ${empty}`;

  } catch {
    container.innerHTML = "Error loading bins";
  }
}

document.addEventListener("DOMContentLoaded", loadBins);